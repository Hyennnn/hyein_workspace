package com.example.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {
    public String solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");

        int lastNum = 0;
        // 모든 인원 넣어주기
        for(int i = 1; i <= n; i++ ) {
            q.offer(i);
        }

        // 모든 사람이 제거 될때 까지 반본
        while(!q.isEmpty()) {
            // 앞에서 k-1명 뒤로 보내기
            for(int i = 1; i<=k -1; i++) {
                q.offer(q.poll());
            }

            // 제거 할 사람은 stirngBuider 가입
            sb.append(q.poll());

            // 제거 후 할사랑이 남은 경우
            if(!q.isEmpty()) {
                sb.append(",");
            }
        }


        sb.append(">");
        return sb.toString();
    }
}
