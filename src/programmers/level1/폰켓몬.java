package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {

    /**
     *
     *
     * @param nums
     * @return
     */
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int max = nums.length / 2;

        return Math.min(set.size(), max);
    }
}
