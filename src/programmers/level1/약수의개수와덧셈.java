package programmers.level1;

import java.util.stream.IntStream;

public class 약수의개수와덧셈 {

    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(i -> (약수의개수구하는메서드(i) % 2 == 0) ? i : -i)
                .sum();
    }

    static int 약수의개수구하는메서드(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }
}
