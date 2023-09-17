package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            // 각 작업이 몇 일 뒤에 배포될 수 있는지 계산
            int days = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            queue.add(days);
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int daysToDeploy = queue.poll(); // 첫 번째 작업의 배포 날짜
            int count = 1; // 배포될 작업 수

            // 다음 작업들 중 함께 배포할 수 있는 작업 수를 세기
            while (!queue.isEmpty() && queue.peek() <= daysToDeploy) {
                queue.poll();
                count++;
            }
            result.add(count);
        }

        // ArrayList를 int[]로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public int[] solution2(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxDays = 0;
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {
            // 각 작업이 몇 일 뒤에 배포될 수 있는지 계산
            int days = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);

            // 이전 작업과 비교하여 같이 배포할 수 있는지 확인
            if (maxDays < days) {
                if (count > 0) {
                    result.add(count);
                }
                count = 1;
                maxDays = days;
            } else {
                count++;
            }
        }

        if (count > 0) {
            result.add(count);
        }

        // ArrayList를 int[]로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

