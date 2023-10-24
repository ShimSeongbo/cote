package programmers.level1;

import java.util.Arrays;

public class 음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        return Arrays.stream(absolutes).map(i -> i * (signs[i] ? 1 : -1)).sum();
    }
}
