package programmers.level1;

public class 행렬의덧셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int rowNumber = arr1.length;
        int columnNumber = arr1[0].length;

        int[][] answer = new int[rowNumber][columnNumber];

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
