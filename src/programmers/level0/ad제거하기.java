package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class ad제거하기 {

    public String[] solution(String[] strArr) {
        List<String> strings = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                strings.add(s);
            }
        }

        return strings.toArray(new String[0]);
    }
}
