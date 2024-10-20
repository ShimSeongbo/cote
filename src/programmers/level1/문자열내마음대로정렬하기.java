package programmers.level1;

import java.util.*;

public class 문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;

        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;

        System.out.println(Arrays.toString(solution(strings1, n1)));
        System.out.println(Arrays.toString(solution(strings2, n2)));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 != c2) {
                return Character.compare(c1, c2);
            } else {
                return s1.compareTo(s2);
            }
        });

        return strings;
    }

}
