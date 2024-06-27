package LambdaAndStream;

/**
 * packageName    : LambdaAndStream
 * fileName       : LambdaEx1
 * author         : Sora
 * date           : 2024-04-30
 * description    : 함수형 인터페이스 타입의 매개변수와 반환타입
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-30        Sora       최초 생성
 */
@FunctionalInterface
interface MyFunction{
    void run(); // public abstract void run();
}

public class LambdaEx1 {

    static void execute(MyFunction f){   // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction(){  // 반환타입이 MyFunction인 메서드
//        MyFunction f = () -> System.out.println("f3.run()");
//        return f;
        return () -> System.out.println("f3.run()");
    }


    public static void main(String[] args) {
        // 람다식으로 Myfunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { // 익명클래스로 run() 구현
            public void run(){  // 오버라이딩 규칙 : 접근제어자가 좁게 X -> public 반드시 붙여준다
                System.out.println("f2.fun()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }

}
