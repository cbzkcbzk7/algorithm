package LambdaAndStream;

import java.io.File;
import java.util.stream.Stream;

/**
 * packageName    : LambdaAndStream
 * fileName       : StreamEx02
 * author         : Sora
 * date           : 2024-05-02
 * description    : map()
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02        Sora       최초 생성
 */
public class StreamEx02 {

    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"),
                            new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        // forEach()는 최종연산이므로 Stream 다시 생성
        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.')!=-1) // 확장자가 없는것은 제외
                .peek(s -> System.out.printf("filename : %s%n", s))
                .map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추출
                .peek(s -> System.out.printf("extension : %s%n",s))
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct()
                .forEach(System.out::print);

        System.out.println();

    }
}
