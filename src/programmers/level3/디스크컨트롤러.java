package programmers.level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 디스크컨트롤러 {

    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]); // 요청 시간 기준 정렬

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]); // 수행 시간이 짧은 순서대로

        int time = 0, total = 0, index = 0;
        while (index < jobs.length || !queue.isEmpty()) {
            while (index < jobs.length && jobs[index][0] <= time) {
                queue.offer(jobs[index++]);
            }

            if (queue.isEmpty()) {
                time = jobs[index][0];
            } else {
                int[] job = queue.poll();
                total += time - job[0] + job[1]; // 대기 시간 계산
                time += job[1];
            }
        }

        return total / jobs.length;
    }
}
