package programmers.level0;

import java.util.*;

public class 중복된문자제거 {

    public String solution(String my_string) {

        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (set.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
