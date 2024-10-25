package programmers.level0;

public class 합성수찾기 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            answer += 약수구하기(i);
        }

        return answer - 1;
    }

    private int 약수구하기(int i) {
        int count = 0;

        for (int n = 1; n * n <= i; n++) {
            if (i % n == 0) count += 2;
            if (n * n == i) count += 1;
        }

        return count >= 3 ? 1 : 0;
    }
}
