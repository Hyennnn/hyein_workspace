package com.example.section05.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// java Collection Framework 에서는 Deque 인터페이스와 이름 구현한 구현체가 있다.
public class Application {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        // 요소 추가
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);
        q.addLast(5);

        System.out.println("요소확인");
        System.out.println(q.getFirst());
        System.out.println(q.getLast());

        // 요소제거
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeLast());
        System.out.println(q.removeLast());
    }
}
