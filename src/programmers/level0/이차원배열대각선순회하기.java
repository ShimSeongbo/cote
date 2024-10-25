package programmers.level0;

public class 이차원배열대각선순회하기 {

    public int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }
}

