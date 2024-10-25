package programmers.level0;

import java.util.Arrays;

public class 문자열잘라서정렬하기 {

    public String[] solution(String myString) {

        return Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}
