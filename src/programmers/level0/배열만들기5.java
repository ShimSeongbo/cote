package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기5 {

    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int substring = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (substring > k) {
                list.add(substring);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
