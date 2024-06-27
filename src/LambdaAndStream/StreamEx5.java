package LambdaAndStream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : LambdaAndStream
 * fileName       : StreamEx5
 * author         : Sora
 * date           : 2024-05-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-05        Sora       최초 생성
 */
public class StreamEx5 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };
        Stream.of(strArr)
                        .parallel()   // 병렬처리를 하기때문에 어떤게 먼저 수행될지 몰라서 출력 순서가 바뀜
                        .forEachOrdered(System.out::println);   // 병렬처리하고 싶은데 순서도 유지하고 싶을 경우
//                        .forEach(System.out::println);

       boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length() == 0); // 어떤 요소도 일치하지 않음 = true
       Optional<String> sWord = Stream.of(strArr)
                                .parallel()
                                .filter(s->s.charAt(0) == 's')
//                                .findFirst();
                                 .findAny();    // 병렬처리의 경우 실행마다 결과 변경

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord.get());

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0 , (a,b) -> a + 1);
        System.out.println("count = " + count);

        int sum = intStream2.reduce(0, (a,b) -> a + b);
        System.out.println("sum = " + sum);

        OptionalInt max = intStream3.reduce(Integer::max);  // identity 초기값을 줄 경우 stream이 비어있으면 초기값 반환..
        System.out.println("max = " + max.getAsInt());

        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("min = " + min.getAsInt());




//        intStream1.peek(s-> System.out.println(s))  //   ** peek() 연산자를 중간연산에 사용해야 동작함!!! 최종으로 사용하면 동작X
//                    .forEach(s-> System.out.printf("strArr.length() = %d%n", s));
    }
}
