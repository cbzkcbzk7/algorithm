package Programmers;

import java.util.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons42586
 * author         : Sora
 * date           : 2024-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-14        Sora       최초 생성
 */
public class lessons42586 {
    public static void main(String[] args) {
//      int[] result =  solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1});
//        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

        int[] result =  solution2(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
    public static int[] solution(int[] progresses, int[] speeds) {
         int[] answer = {};

        // 1. 앞의 기능이 배포되어야 뒤에 기능도 배포 가능 -- FIFO (Queue)
        // 2. 각 기능이 몇일뒤 배포 가능한지 계산한다(100프로).
        int possibleDay = 0;
        Queue q = new LinkedList();
        Queue q2 = new LinkedList();
        List list = new ArrayList();
        for(int i = 0; i < progresses.length; i++){
            // 배포날짜 : 반올림
            possibleDay = (int)Math.ceil((100 - progresses[i])/(float)speeds[i]);
            q.offer(possibleDay);
        }
        // 3. 앞의 배포 날짜보다 같거나 작은 날짜들을 카운트한다(같은 날 배포)
        // 3-1. 비교
        int dDay = 1; // poll한 순간 1개의 기능 배포
        q2.offer(q.poll());

        while(!q.isEmpty()){

            if((Integer)q2.peek() >= (Integer)q.peek()){
                q2.offer(q.poll());

            }else if((Integer)q2.peek() < (Integer)q.peek()){
                list.add(q2.size());
                q2.clear(); // 초기화
                q2.offer(q.poll());
            }

        }
        if(q.isEmpty() && q2.peek() != null){
            list.add(q2.size());
        }

        // 4. 앞의 배포 날짜보다 작은 큰 날짜를 만나면 3.의 값 카운트 종료
        // 5. 4번의 배포 날짜 기준으로 3을 반복한다
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = (Integer)list.get(i);
        }
        return answer;
    }

    public static int[] solution2(int[] progresses, int[] speeds){
        int[] answer = new int[100];

        Queue<Integer> q = new LinkedList<>();
      //  List<Integer> answerList = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < speeds.length; i++){
           double remain = (100 - progresses[i]) / (double)speeds[i];
            int date = (int)Math.ceil(remain);

            if(!q.isEmpty() && q.peek() < date){  // 겹치는 기능 배포가 없을 때
              //  answerList.add(q.size());
                answer[idx++] = q.size();
                q.clear();
            }

            q.offer(date); // 처음에는 여기로 들어옴,,,
        }

    //    answerList.add(q.size());
            answer[idx++] = q.size();

        return Arrays.stream(answer).filter(i -> i > 0).toArray();
    }

    public int solution(int[] scoville, int K) {

        int mixCnt = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int scov : scoville){
            pq.offer(scov);
        }


        while(pq.size() > 1 && pq.peek() < K){
            int firstWeakScov = pq.poll();
            int secWeakScov = pq.poll();

            int mixScov = firstWeakScov + (secWeakScov*2);

            pq.offer(mixScov);
            ++mixCnt;
        }

        if( pq.peek() < K ) mixCnt = -1;
     //   mixCnt = pq.peek() < K ? -1 : mixCnt;

        // 6. 안넘으면 2번부터 반복

        return mixCnt;
    }


}


