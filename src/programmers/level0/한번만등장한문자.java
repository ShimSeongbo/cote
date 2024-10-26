package programmers.level0;

import java.util.Arrays;

public class 한번만등장한문자 {

    public String solution(String s) {
        int[] ints = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ints[c - 'a'] += 1;
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }

        char[] result = sb.toString().toCharArray();
        Arrays.sort(result);

        return new String(result);
    }
}
