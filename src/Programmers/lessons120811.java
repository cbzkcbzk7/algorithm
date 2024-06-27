package Programmers;

import java.util.Arrays;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120811
 * author         : Sora
 * date           : 2024-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-27        Sora       최초 생성
 */
public class lessons120811 {
    public static void main(String[] args) {
      int result1 =  solution(new int[]{1,2,7,10,11});
      int result2 =  solution(new int[]{-1, -2, -3, 0, 1});

      //  System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    static public int solution(int[] array) {
        Arrays.sort(array);

        for(int a : array) System.out.print(a+",");
        System.out.println();

        return array[array.length/2];
    }
}
