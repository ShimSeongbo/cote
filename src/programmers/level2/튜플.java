package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        return Arrays.stream(s.substring(2, s.length() - 2).split("\\},\\{"))
                .sorted(Comparator.comparingInt(String::length))
                .flatMap(str -> Arrays.stream(str.split(",")))
                .mapToInt(Integer::parseInt)
                .distinct()
                .toArray();
    }
}