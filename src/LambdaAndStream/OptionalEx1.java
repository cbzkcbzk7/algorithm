package LambdaAndStream;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * packageName    : LambdaAndStream
 * fileName       : OptionalEx1
 * author         : Sora
 * date           : 2024-05-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02        Sora       최초 생성
 */
public class OptionalEx1 {

    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length); // s -> s.length()
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123")     // 문자열을
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();      // 숫자로 변경  s -> Integer.parseInt(s)

        int result2 = Optional.of("")
                        .filter(x->x.length() > 0)
                                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3=%d%n", x)); // ifPresent : 값이 있으면 주어진 람다식을 수행함

        OptionalInt optInt1 = OptionalInt.of(0); // 0을 저장
        OptionalInt optInt2 = OptionalInt.empty();    // 빈 객체를 생성

        System.out.println("optInt1.isPresent() = " + optInt1.isPresent());
        System.out.println("optInt2.isPresent() = " + optInt2.isPresent());

        System.out.println("optInt1.getAsInt() = " + optInt1.getAsInt());
//        System.out.println("optInt2.getAsInt() = " + optInt2.getAsInt()); // NoSuchElementException

        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);

        System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));


        Optional<String> opt = Optional.ofNullable(null); // null을 저장
        Optional<String> opt2 = Optional.empty();               // 빈 객체를 생성
        System.out.println("opt = " + opt);
        System.out.println("opt2 = " + opt2);
        System.out.println("opt.equals(opt2) = " + opt.equals(opt2)); // true :
    }
}
