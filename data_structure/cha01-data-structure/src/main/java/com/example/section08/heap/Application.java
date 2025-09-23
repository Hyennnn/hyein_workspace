package com.example.section08.heap;

import java.util.PriorityQueue;

// java collection framework에서 Heap 직접 지원하는 크래스는 없지만
// priorityQueue 클래스를 이용해 heep 구현
public class Application {
    public static void main(String[] args) {
        //최소함
        PriorityQueue<Integer> minHeqp = new PriorityQueue<>();

        // 요소추가
        minHeqp.offer(10);
        minHeqp.offer(5);
        minHeqp.offer(8);

        // 최소값 조회 (큐에서 가장 앞에 있는 값 조회
        System.out.println(minHeqp.peek());

        // 최소값 제거
        System.out.println(minHeqp.poll());
        System.out.println(minHeqp.peek());

        System.out.println();
        // 최대힙
        PriorityQueue<Integer> maxHeqp = new PriorityQueue<>((a,b)->b-a);

        // 요소 추가
        maxHeqp.offer(10);
        maxHeqp.offer(5);
        maxHeqp.offer(8);

        // 최대 값 조회
        System.out.println(maxHeqp.peek());
        System.out.println(maxHeqp.poll());
        System.out.println(maxHeqp.peek());
    }

}
