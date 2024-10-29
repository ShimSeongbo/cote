package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {

    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 2) {
            factors.add(n);
        }

        return factors.stream().mapToInt(i -> i).distinct().sorted().toArray();
    }
}
