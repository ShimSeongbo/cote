package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 세개의구분자 {

    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ");

        String[] split = myStr.split(" ");
        List<String> result = Arrays.stream(split)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        return result.isEmpty() ? new String[] {"EMPTY"} : result.toArray(new String[0]);
    }
}
