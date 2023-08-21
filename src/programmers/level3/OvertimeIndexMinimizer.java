package programmers.level3;

import java.util.PriorityQueue;

public class OvertimeIndexMinimizer {
    public long solution(int n, int[] works) {
        long answer = 0;

        // 우선순위 큐를 사용해서 작업량을 관리합니다.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int work : works) {
            pq.add(work);
        }

        // 남은 시간 동안 가장 큰 작업량을 줄입니다.
        while (n > 0) {
            int currentWork = pq.poll();

            // 작업량을 줄입니다.
            currentWork--;
            n--;

            // 작업량이 0보다 작아지면 0으로 만듭니다.
            if (currentWork < 0) {
                currentWork = 0;
            }

            pq.add(currentWork);
        }

        // 최종적인 작업량을 제곱하여 야근 피로도를 계산합니다.
        while (!pq.isEmpty()) {
            int work = pq.poll();
            answer += (long) work * work;
        }

        return answer;
    }

    public static void main(String[] args) {
        OvertimeIndexMinimizer solution = new OvertimeIndexMinimizer();
        System.out.println(solution.solution(4, new int[]{4, 3, 3})); // 12
        System.out.println(solution.solution(1, new int[]{2, 1, 2})); // 6
        System.out.println(solution.solution(3, new int[]{1, 1})); // 0
    }
}
