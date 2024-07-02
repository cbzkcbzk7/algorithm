package Programmers;

import java.util.Arrays;

/**
 * packageName    : Programmers
 * fileName       : lessons42577
 * author         : Sora
 * date           : 2024-07-02
 * description    : 전화번호 목록
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-02        Sora       최초 생성
 */
public class lessons42577 {

    public static void main(String[] args) {
        boolean result = solution(new String[]{"12","123","1235","567","88"});
        System.out.println("result = " + result);
    }

    static boolean solution(String[] phone_book) {
        // 1. 정렬한다.
        // 2. 바로 뒤의 인덱스가 해당 인덱스의 접두어인지 확인한다.
        // 3. 있으면 false break;
        // 4. 없으면 true
        boolean answer = true;

        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return answer;
    }
}
