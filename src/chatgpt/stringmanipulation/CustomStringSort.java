package chatgpt.stringmanipulation;

import java.util.Arrays;

public class CustomStringSort {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};
        int n = 1;

        String[] result = solution(strings, n);
        System.out.println(Arrays.toString(result));
    }

    private static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 != c2) {
                return Character.compare(c1, c2);
            } else {
                return s2.compareTo(s1);
            }
        });

        return strings;
    }
}
