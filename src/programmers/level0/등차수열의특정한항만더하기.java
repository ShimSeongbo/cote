package programmers.level0;

public class 등차수열의특정한항만더하기 {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        if (included[0] == true) answer += a;

        for (int i = 1; i < included.length; i++) {
            if (included[i] == true) {
                answer += a + (i * d);
            }
        }

        return answer;
    }
}
