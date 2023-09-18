package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    class Pair {
        int idx;
        int priority;
        public Pair(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Pair(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            boolean flag = false;

            // Check if there exists a process with higher priority
            for (Pair p : queue) {
                if (p.priority > cur.priority) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                queue.offer(cur);
            } else {
                answer++;
                if (cur.idx == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
