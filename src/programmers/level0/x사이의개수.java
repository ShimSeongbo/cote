package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x사이의개수 {

    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        String myString2 = "xabcxdefxghi";
        System.out.println(Arrays.toString(solution(myString2)));
    }

    public static int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);

            if (c == 'x') {
                list.add(count);
                count = 0;
            } else {
                count++;
            }
        }

        list.add(count);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
