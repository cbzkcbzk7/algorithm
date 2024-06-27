package LambdaAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : LambdaAndStream
 * fileName       : StreamEx01
 * author         : Sora
 * date           : 2024-05-01
 * description    : 스트림 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-01        Sora       최초 생성
 */
public class StreamEx01 {

    public static void main(String[] args) {

        // 1. 스트림 만들기(Collection과 Array)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list를 데이터 소스로 하는 새로운 스트림을 생성
        intStream.forEach(System.out::print);
        System.out.println();

        // stream은 일회용으로 최종연산 후 재사용을 위해서는 다시 생성해줘야한다
        intStream = list.stream();
        intStream.forEach(System.out::print);
        System.out.println();

//        Stream<String> strStream = Stream.of("a","b","c");
        Stream<String> strStream = Stream.of(new String[]{"a", "b", "c", "d"});
        strStream.forEach(System.out::print);
        System.out.println();

//      2. IntStrema 과 Stream<T>
        int[] intArr = {1, 2, 3, 4, 5};                     // IntStream사용시 오토박싱&언박싱 하지 않으므로 속도 향상
        IntStream intStream1 = Arrays.stream(intArr);   // IntStream에서는 여러가지 연산이 있지만 Stream<Integer>에는 count()뿐임
//        intStream1.forEach(System.out::print);
//        System.out.println("intStream1.count() = " + intStream1.count());
//        System.out.println("intStream1.sum() = " + intStream1.sum());
        System.out.println("intStream1.average() = " + intStream1.average());

        Integer[] integerArr = {1, 2, 3, 4, 5};
        // Stream<T>는 숫자외에도 여러 타입의 스트림이 가능해야하므로 숫자 스트림에만 사용할 수 있는 연산들을 넣지 않았음
        Stream<Integer> integerStream = Stream.of(integerArr);
//        integerStream.forEach(System.out::print);
        System.out.println("integerStream.count() = " + integerStream.count());

//      3. 난수 스트림 만들기

        IntStream intStream2 = new Random().ints(6, 0, 10); // 랜덤으로 Integer 난수 생성 (무한스트림)
        intStream2
//                .limit(5) // 무한스트림이라 limit로 안짤라주면 무한으로 출력됨
                .forEach(System.out::print);
        System.out.println();

        //                  단항연산자 : 하나를 넣으면 결과 하나 나옴
        // 4. interate(seed, UnaryOperator f) : seed 사용 , generate() : seed 사용x
      Stream<Integer> intStream3 = Stream.iterate(2, n -> n+2);
        intStream3
                .limit(10)
                .forEach(System.out::println);

        // generate(Supplier s) : 주기만 함.. 입력 X 출력만 O
      Stream<Integer> intStream4 = Stream.generate(()-> 1);
        intStream4
                .limit(10)
                .forEach(System.out::print);
    }


}
