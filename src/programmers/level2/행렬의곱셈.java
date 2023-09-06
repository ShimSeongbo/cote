package programmers.level2;

public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows1 = arr1.length; // arr1의 행의 수
        int cols1 = arr1[0].length; // arr1의 열의 수
        int cols2 = arr2[0].length; // arr2의 열의 수

        int[][] answer = new int[rows1][cols2]; // 결과를 저장할 배열

        for (int i = 0; i < rows1; i++) { // arr1의 각 행에 대해서
            for (int j = 0; j < cols2; j++) { // arr2의 각 열에 대해서
                int sum = 0; // 해당 위치에 들어갈 값
                for (int k = 0; k < cols1; k++) { // arr1의 행과 arr2의 열을 곱하기 위한 루프
                    sum += arr1[i][k] * arr2[k][j]; // 곱셈과 덧셈을 수행
                }
                answer[i][j] = sum; // 결과를 저장
            }
        }

        return answer; // 결과 행렬을 반환
    }
}
