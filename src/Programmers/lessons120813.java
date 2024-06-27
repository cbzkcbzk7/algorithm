package Programmers;

import java.util.Arrays;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120813
 * author         : Sora
 * date           : 2024-05-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-28        Sora       최초 생성
 */
public class lessons120813 {
    public static void main(String[] args) {
       int[] result = solution(15);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    public static int[] solution(int n) {
        // 1. 정수 n까지 순서대로 반복한다.
        // 2. 홀수만 배열에 담는다.
        // 3. return

        int arr_length = (n%2!=0) ? (n/2)+1 : n/2;
        int[] answer = new int[arr_length];
        int j = 0;
        System.out.println("arr_length = " + arr_length);

        for(int i = 1; i <= n; i+=2){

                answer[j++] = i;

        }
//        for(int i = 1; i <= n; i++){
//            if(i%2!=0){
//                System.out.println("i = " + i);
//                answer[j++] = i;
//            }
//        }

        return answer;
    }
}
