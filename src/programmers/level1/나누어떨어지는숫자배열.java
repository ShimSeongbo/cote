package programmers.level1;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

    public int[] solution(int[] arr, int divisor) {
        int[] array = Arrays.stream(arr)
                .filter(n -> n % divisor == 0)
                .sorted()
                .toArray();

        if (array.length == 0) {
            return new int[] {-1};
        }

        return array;
    }
}
