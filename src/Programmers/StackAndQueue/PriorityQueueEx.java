package Programmers.StackAndQueue;

import java.util.*;

/**
 * packageName    : Programmers.StackAndQueue
 * fileName       : PriorityQueue
 * author         : Sora
 * date           : 2024-06-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-04        Sora       최초 생성
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println("pq = " + pq);

        Object obj = null;

        // PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
        while((obj = pq.poll()) != null){
            System.out.println("obj = " + obj);
        }

    }
}
