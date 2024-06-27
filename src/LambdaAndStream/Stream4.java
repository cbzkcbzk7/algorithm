package LambdaAndStream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * packageName    : LambdaAndStream
 * fileName       : Stream4
 * author         : Sora
 * date           : 2024-05-02
 * description    : flatMap()
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02        Sora       최초 생성
 */
public class Stream4 {

    public static void main(String[] args) {
        Stream<String[]> strArrStr = Stream.of(
                new String[]{"abc","def","jkl"},
                new String[]{"ABC","GHI","JKL"});

      //  Stream<Stream<String>> strStrmStrm = strArrStr.map(s -> Arrays.stream(s));
        Stream<String> strStrm = strArrStr.flatMap(Arrays::stream);

        strStrm
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Stream.of(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(s -> s.toLowerCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();


    }
}
