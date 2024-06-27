package Programmers;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120808
 * author         : Sora
 * date           : 2024-05-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-26        Sora       최초 생성
 */
public class lessons120808 {
    public static void main(String[] args) {
        solution(1,2,3,4);
        solution(9,2,1,3);
    }

    static public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 분모끼리 곱한다
        int denom3 = denom1*denom2;

        // 2. 분자*반대 분모
        int numer3 = (numer1*denom2) + (numer2*denom1);

        if(denom3%2==0 && numer3%2==0){
            denom3 = denom3/2;
            numer3 = numer3/2;
        }

        // 3. 더한다
        // 4. 최대공약수를 구한다
        // 5. 기약분수 return

        int[] answer = {numer3, denom3};
        return answer;
    }
}
