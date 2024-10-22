package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 약수구하기 {

    public static void main(String[] args) {

    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        if (n == 1) {
            return new int[]{1};
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
