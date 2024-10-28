package programmers.level0;

import java.util.Arrays;

public class 조건에맞게수열변환하기2 {

    public int solution(int[] arr) {
        int answer = 0;
        boolean changed;

        do {
            changed = false;
            answer++;

            for (int i = 0; i < arr.length; i++) {
                int original = arr[i];

                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }

                if (arr[i] != original) {
                    changed = true;
                }
            }
        } while (changed);

        return answer - 1;
    }

    // 시간초과
    public int solution0(int[] arr) {
        int answer = 0;
        int[] preArr;
        int[] afterArr = Arrays.copyOf(arr, arr.length);

        do {
            preArr = Arrays.copyOf(afterArr, afterArr.length);
            answer++;

            for (int i = 0; i < preArr.length; i++) {
                if ((preArr[i] >= 50) || (preArr[i] % 2 == 0)) {
                    afterArr[i] = preArr[i] / 2;
                } else if ((preArr[i] < 50) && (preArr[i] % 2 != 0)) {
                    afterArr[i] = preArr[i] * 2 + 1;
                } else {
                    afterArr[i] = preArr[i];
                }
            }
        } while (!isSameArr(preArr, afterArr));

        return answer - 1;
    }

    private boolean isSameArr(int[] preArr, int[] afterArr) {
        for (int i = 0; i < preArr.length; i++) {
            if (preArr[i] != afterArr[i]) return false;
        }

        return true;
    }
}
