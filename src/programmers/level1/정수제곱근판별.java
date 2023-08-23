package programmers.level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long sqrtN = (long) Math.sqrt(n);

        return (sqrtN * sqrtN == n) ? (sqrtN + 1) * (sqrtN + 1) : -1;

        /**
        if (sqrtN * sqrtN == n) {
            return (sqrtN + 1) * (sqrtN + 1);
        }
        return -1;
         */
    }


}
