package Programmers;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120806
 * author         : Sora
 * date           : 2024-05-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-26        Sora       최초 생성
 */
public class lessons120806 {
    public static void main(String[] args) {
       int result = solution(3,2);

        System.out.println("result = " + result);
    }

    static int solution(int num1, int num2) {
        int answer = 0;

        // 1. num1을 num2로 나눈다
       float result = (float)num1/num2*1000;

        // 2. 1번의 값의 1000을 곱한 후 return
//        result = result * 1000;

        answer = (int)result;

        return answer;
    }
}
