package Programmers;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120809
 * author         : Sora
 * date           : 2024-05-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-26        Sora       최초 생성
 */
public class lessons120809 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};

       int[] arr = solution(new int[]{1,2,3,4,5});
       for(int a : arr)
           System.out.println("a = " + a);
    }
    static public int[] solution(int[] numbers) {
        int[] answer = {};
        answer = new int[numbers.length];

        for(int i=0; i < numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}
