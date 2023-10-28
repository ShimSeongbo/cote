package programmers.level1;

import java.util.LinkedList;
import java.util.List;

public class 같은숫자는싫어 {

    public int[] solution(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        List<Integer> resultList = new LinkedList<>();
        int previousNum = arr[0];
        resultList.add(previousNum);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != previousNum) {
                previousNum = arr[i];
                resultList.add(previousNum);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
