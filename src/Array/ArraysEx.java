package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : Array
 * fileName       : ArraysEx
 * author         : Sora
 * date           : 2024-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-27        Sora       최초 생성
 */
public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D)); // 2차원 배열 출력은 deepToString

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // index
        int[] arr5 = Arrays.copyOfRange(arr, 0, 7); // 복사할 길이 넘어가면 0으로 채움

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*6) +1);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        for(int i : arr7){
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};
        Arrays.sort(chArr);
        System.out.println(Arrays.toString(chArr));
        int idx = Arrays.binarySearch(chArr, 'B');
        System.out.println("Bidx = " + idx);


    }
}
