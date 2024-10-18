package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 두개뽑아서더하기 {

    class Solution {
        public int[] solution(int[] numbers) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    list.add(numbers[i] + numbers[j]);
                }
            }

            return list.stream().mapToInt(i -> i).sorted().distinct().toArray();

        }
    }
}
