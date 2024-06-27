package Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : Array
 * fileName       : ComparatorEx
 * author         : Sora
 * date           : 2024-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-14        Sora       최초 생성
 */
public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
        System.out.println("strArr = " + Arrays.toString(strArr));

//        Arrays.sort(strArr, new Decending());
//        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println("strArr = " + Arrays.toString(strArr));


    }
}

class Decending implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
//        if(o1 instanceof Comparable && o2 instanceof Comparable){
//            Comparable c1 = (Comparable)o1;
//            Comparable c2 = (Comparable)o2;
//
//            return c1.compareTo(c2) * -1;
//        }
        return o2.compareTo(o1);
    }
}
