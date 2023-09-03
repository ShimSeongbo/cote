package programmers.level2;

public class 배열자르기 {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);  // 결과 배열의 길이
        int[] answer = new int[len];

        for (long i = left; i <= right; i++) {
            long row = i / n;  // 0-based row index
            long col = i % n;  // 0-based column index

            // 대각선 블록의 값은 row와 col 중 더 큰 값 + 1
            answer[(int)(i - left)] = (int)Math.max(row, col) + 1;
        }

        return answer;
    }
}
