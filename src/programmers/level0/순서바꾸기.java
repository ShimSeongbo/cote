package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3/20
public class 순서바꾸기 {

    public static void main(String[] args) {
        int n = 3;
        int[] num_list = {5, 2, 1, 7, 5};

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    // 시간 복잡도. O(n)
    // 모든 제한사항에 맞을까여?
    // 테스트케이스 염두는? 가장 작은 크기. 요소들이 모두 같은 경우 등
    public static int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
