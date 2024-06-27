package LambdaAndStream;

import java.util.stream.IntStream;

/**
 * packageName    : LambdaAndStream
 * fileName       : Stream1
 * author         : Sora
 * date           : 2024-05-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-01        Sora       최초 생성
 */
public class Stream1 {
    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1,10);  // 10 포함
        intStream
                .skip(3)
                .limit(5)
                .forEach(System.out::print);
        System.out.println();

        IntStream intStream2 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
        intStream2
                .distinct()
                .filter(i->i%2==0)  // true인 것만 통과
                .forEach(System.out::print);
        System.out.println();


        // filter 여러번 사용 가능
        intStream = IntStream.rangeClosed(1,10);
        intStream
                .filter(i->i%2!=0 && i%3!=0) // &&로 결합 가능
                .forEach(System.out::print);
        System.out.println();

        intStream = IntStream.rangeClosed(1,10);
        intStream
                .filter(i->i%2!=0)
                .filter(i->i%3!=0)
                .forEach(System.out::print);

    }


}
