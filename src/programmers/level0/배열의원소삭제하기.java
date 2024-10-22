package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class 배열의원소삭제하기 {

    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }

    /**
     * 1. 문제 요약
     *  - 서로 다른 원소를 갖는 두 배열의 차집합을 구하는 문제
     * 2. 제한 사항
     * 3. 풀이 전략
     *  - delete_list Array를 Set로 변환 후,
     *  - for-loop를 이용하여, 주어진 arr Array를 순차적으로 탐색하며, 삭제 요소를 빠르게 제거하였습니다.
     * 4. 세부 구현
     *  - 제거되지 않은 요소를 List에 저장한 후 Array로 변환하여 반환하였습니다.
     */
    public static int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> delete_set = new HashSet<>();
        for (int i : delete_list) {
            delete_set.add(i);
        }

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (!delete_set.contains(i)) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
