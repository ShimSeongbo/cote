package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {

    public int[] solution1(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }

    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        while (!isPowerOfTwo(list.size())) {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
