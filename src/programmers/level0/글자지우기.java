package programmers.level0;

import java.util.HashSet;
import java.util.Set;

public class 글자지우기 {

    public String solution(String my_string, int[] indices) {
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i : indices) {
            set.add(i);
        }

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (!set.contains(i)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
