package LambdaAndStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * packageName    : LambdaAndStream
 * fileName       : LambdaEx
 * author         : Sora
 * date           : 2024-04-30
 * description    : java.util.function 패키지
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-30        Sora       최초 생성
 */
public class LambdaEx {

    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
        Consumer<Integer> c = i -> System.out.print(i+", ");
        Predicate<Integer> p = i ->i%2==0;
        Function<Integer,Integer> f = i -> i/10*10; // i의 1의 자리를 없앤다

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println("list = " + list);

        printEvenNum(p,c,list);
        doSomething(f,list,c);

    }

    static <T> void doSomething(Function<T,T> f, List<T> list, Consumer<T> c){
        List<T> newList = new ArrayList<T>(list.size());

        for(T i : list){
            newList.add(f.apply(i));
        }

        for(T i : newList){
            c.accept(i);
        }
    }
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list ){
        System.out.print("[");
        for(T i : list){
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for(int i=0; i<10; i++){
            list.add(s.get());
        }
    }
}
