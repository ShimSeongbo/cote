package programmers.level0;

import java.util.Arrays;

public class 가까운1찾기 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0};
//        int[] arr = {1, 0, 0, 1, 0, 0};
        int idx = 3;

        System.out.println(solution(arr, idx));
    }

    public static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}
