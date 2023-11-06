package programmers.level1;

import java.util.Collections;
import java.util.PriorityQueue;

public class 명예의전당1 {

    public int[] solution(int k, int[] score) {
        // 최소 힙을 사용하여 상위 k개 점수를 유지
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            // 처음 k일 동안은 모든 점수를 명예의 전당에 포함
            if (i < k) {
                minHeap.offer(score[i]);
            } else {
                // k일 이후부터는 현재 점수가 최소 힙의 root (k번째 점수)보다 크면 교체
                if (score[i] > minHeap.peek()) {
                    minHeap.poll(); // k번째 점수 제거
                    minHeap.offer(score[i]); // 새로운 점수 추가
                }
            }
            // 명예의 전당의 k번째 점수(현재 최소 점수)를 결과에 추가
            answer[i] = minHeap.peek();
        }

        return answer;
    }
}
