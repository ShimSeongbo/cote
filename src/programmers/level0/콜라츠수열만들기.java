package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 콜라츠수열만들기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }

    /**
     * 문제 해결을 위해 ArrayList를 활용하여, 콜라츠 수열의 결과를 동적으로 저장했습니다.
     * 그런 다음, while문을 사용하여 n이 1이 될 때가지 반복 수행하였고,
     * 짝수와 홀수 조건에 따라 n을 적절히 업데이트 하였습니다.
     * 모든 단계에서의 값을 ArrayList 에 추가하였고, 마지막으로 이 리스트를 배열로 변환하여 반환하였습니다.
     */
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        list.add(n);

        while (!(n == 1)) {
            if (n % 2 == 0) {
                n = n / 2;
                list.add(n);
            } else {
                n = 3 * n + 1;
                list.add(n);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
