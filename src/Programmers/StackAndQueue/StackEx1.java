package Programmers.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * packageName    : Programmers.StackAndQueue
 * fileName       : StackEx1
 * author         : Sora
 * date           : 2024-06-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-04        Sora       최초 생성
 */
public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
           goURL("1.네이트");
           goURL("2.야후");
           goURL("3.네이버");
           goURL("4.다음");

           printStatus();

           goBack();
           System.out.println("= '뒤로' 버튼을 누른 후 =");
           printStatus();

           goForward();
           System.out.println("= '앞으로' 버튼을 누른 후 =");
           printStatus();


    }

    public static void goURL(String url){
        back.push(url);
        if(!forward.empty()){
            forward.clear();
        }
    }

    public static void printStatus(){
        System.out.println("back = " + back);
        System.out.println("forward = " + forward);
    }

    public static void goForward(){
        if(!forward.empty()){
           back.push(forward.pop());
        }
    }
    public static void goBack(){
        if(!back.empty()){
            forward.push(back.pop());
        }
    }
}
