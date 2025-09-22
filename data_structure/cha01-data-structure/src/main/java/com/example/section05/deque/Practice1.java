package com.example.section05.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {

    static class Ballon {
        int order;
        int noteValue;

        Ballon(int order, int noteValue) {
            this.order = order;
            this.noteValue = noteValue;
        }
    }

    public String solution(Integer[] notes) {
        StringBuilder sb = new StringBuilder();

        // 풍선을 Deque에 삽입
        Deque<Ballon> ballons = new ArrayDeque<>();
        for(int i = 0; i < notes.length; i++){
            ballons.addLast(new Ballon(i + 1, notes[i]));

        }

        // 무조건 첫 번째 풍선 먼저 제거
        Ballon current = ballons.removeFirst();
        sb.append(current.order);

        // 모든 풍선이 제거 될 때 까지 제거
        while (!ballons.isEmpty()) {
            // 터진 풍선에 기록 된 이동 값
            int moveValue = current.noteValue;

            if(moveValue > 0){
                // 양수 : 오른쪽 이동
                for(int i = 1; i < notes.length; i++){
                    ballons.addLast(ballons.removeFirst());
                }
            } else {
                // 음수 : 왼쪽 이동
                for (int i = 1; i < -noteValue; i++) {
                    ballons.addFirst(ballons.removeLast());
                }
                current = ballons.removeLast();
            }

            sb.append(" ")
              .append(moveValue);

        }

        return sb.toString();
    }




}
