package exemple.section01.list.comparator;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        // Queue
        Queue<String> que = new LinkedList<>();

        // 큐에 데이터를 삽입 할 때 offer 메소드 활용
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        // 큐에서 데이터 꺼내는 메소드
        // peek : 큐의 가장 옆에 (먼저 들어온) 요소 반환
        // poll : 큐의 가장 앞에(먼저 들어온) 오소 제거 후 반환
        System.out.println("peek = " + que.peek());
        System.out.println("que = " + que);

        System.out.println();

        System.out.println("poll = " + que.poll());
        System.out.println("que = " + que);

        System.out.println("poll = " + que.poll());
        System.out.println("poll = " + que.poll());
        System.out.println("poll = " + que.poll());
        System.out.println("poll = " + que.poll());
        System.out.println("poll = " + que.poll()); // null 값 반환
    }
}
