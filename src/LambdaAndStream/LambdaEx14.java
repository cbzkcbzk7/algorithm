package LambdaAndStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * packageName    : LambdaAndStream
 * fileName       : LambdaEx14
 * author         : Sora
 * date           : 2024-04-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-30        Sora       최초 생성
 */
public class LambdaEx14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(i);

        // list의 모든 요소 출력
        list.forEach(i -> System.out.print(i+","));
        System.out.println();

        // list에서 2또는 3의 배수 제거
        list.removeIf(x-> x%2==0 || x%3==0);
        System.out.println("list = " + list);

        // list 각 요소에 10을 곱한다
        list.replaceAll(i-> i*10);
        System.out.println("list = " + list);

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        map.forEach((k,v) -> System.out.print("{"+k+","+v+"} ,"));

        // 1.람다
//        Supplier<MyClass> s = () -> new MyCalss();

        // 2. 메서드 참조
//        Supplier<MyClass> s = MyClass::new;

        // 3. 생성자의 메서드 참조
        Function<Integer,MyClass> s = MyClass::new;

        // supplier.get()
//        System.out.println(s.get()); // 객체 생성

        // funcion.apply()
        System.out.println(s.apply(2).iv);

        // 배열
//        Function<Integer,int[]> f2 = (i) -> new int[i];
        Function<Integer,int[]> f2 = int[]::new;
        System.out.println(f2.apply(200).length);

    }
}

class MyClass{
    int iv;

    MyClass(int iv){
        this.iv = iv;
    }
}
