package programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

    public long solution(long n) {
        char[] chars = Long.toString(n).toCharArray();
        Arrays.sort(chars);

        return Long.parseLong(new StringBuilder(new String(chars)).reverse().toString());
    }
}
