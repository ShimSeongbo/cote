package programmers.level3;


import java.util.Arrays;

class 숫자게임 {

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int idxB = 0;
        for (int idxA = 0; idxA < A.length; idxA++) {
            while (idxB < B.length) {
                if (B[idxB] > A[idxA]) {
                    answer++;
                    idxB++;
                    break;
                }
                idxB++;
            }
        }

        return answer;
    }

}
