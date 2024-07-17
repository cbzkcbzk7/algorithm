package Programmers;

import java.util.Arrays;

/**
 * packageName    : Programmers
 * fileName       : Test
 * author         : Sora
 * date           : 2024-07-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-03        Sora       최초 생성
 */
public class Test {
    public static void main(String[] args) {
//        String str = "ABCDE";
//        str.substring(3,5); // 3 sec, 136ms

        String[] arr = {"A","B","C","D","E"};
        Arrays.copyOfRange(arr, 3,5);
    }
}
