package programmers.level2;

import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 배열의 원소들을 우선순위 큐에 넣습니다.
        for(int scov : scoville) {
            pq.add(scov);
        }

        while(pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();

            int mixed = first + (second * 2);
            pq.add(mixed);
            answer++;
        }

        if(pq.peek() < K) {
            return -1;  // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
        }

        return answer;
    }
}

