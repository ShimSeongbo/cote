package programmers.level0;

import java.util.Arrays;

public class 문자열정렬하기2 {

    // O(nlog n)
    public String solution(String my_string) {
        String lowerCase = my_string.toLowerCase();

        char[] charArray = lowerCase.toCharArray();
        Arrays.sort(charArray);

//        String result = new String(charArray);

        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append(c);
        }

        return sb.toString();
    }
}
