package programmers.level0;

import java.util.ArrayList;

public class 빈배열에추가삭제하기 {

    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();  // 결과 배열을 저장할 리스트

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                // flag[i]가 true이면 arr[i] * 2번 arr[i]를 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                // flag[i]가 false이면 마지막 arr[i]개의 원소 제거
                for (int j = 0; j < arr[i]; j++) {
                    X.remove(X.size() - 1);
                }
            }
        }

        // ArrayList를 배열로 변환하여 반환
        return X.stream().mapToInt(i -> i).toArray();
    }
}
