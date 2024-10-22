package programmers.level0;

import java.util.Arrays;

public class 배열만들기3 {

    public int[] solution(int[] arr, int[][] intervals) {
        int[] interval0 = intervals[0];
        int[] interval1 = intervals[1];

        int[] part1 = Arrays.copyOfRange(arr, interval0[0], interval0[1] + 1);
        int[] part2 = Arrays.copyOfRange(arr, interval1[0], interval1[1] + 1);

        int[] result = new int[part1.length + part2.length];

        System.arraycopy(part1, 0, result, 0, part1.length);
        System.arraycopy(part2, 0, result, part1.length, part2.length);

        return result;
    }
}
