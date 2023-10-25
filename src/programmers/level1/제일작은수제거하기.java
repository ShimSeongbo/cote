package programmers.level1;

import java.util.Arrays;

public class 제일작은수제거하기 {

    public int[] solution(int[] arr) {
        if (arr.length - 1 == 0) {

            return new int[] {-1};
        }

        int min = Arrays.stream(arr).min().orElseThrow();

        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
