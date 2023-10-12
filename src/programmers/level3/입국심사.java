package programmers.level3;

public class 입국심사 {
    public long solution(int n, int[] times) {
        // 가능한 최소 시간과 최대 시간 설정
        long left = 1;
        long right = (long) times[times.length - 1] * n;  // 최악의 경우의 시간
        long mid;
        long answer = right;

        while (left <= right) {
            mid = (left + right) / 2;

            // mid 시간 동안 처리할 수 있는 전체 사람 수 계산
            long total = 0;
            for (int time : times) {
                total += mid / time;
            }

            // n명을 처리할 수 있는 경우
            if (total >= n) {
                if (mid < answer) {  // 더 짧은 시간을 찾으면 업데이트
                    answer = mid;
                }
                right = mid - 1;
            } else {  // n명을 처리할 수 없는 경우
                left = mid + 1;
            }
        }

        return answer;
    }
}

