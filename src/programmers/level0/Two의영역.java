package programmers.level0;

import java.util.Arrays;

public class Two의영역 {

    public int[] solution(int[] arr) {
        int firstNum = -1;
        int lastNum = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstNum == -1) {
                    firstNum = i;
                }

                lastNum = i;
            }
        }

        if (firstNum == -1) {
            return new int[] {-1};
        }

        return Arrays.copyOfRange(arr, firstNum, lastNum + 1);
    }

    public int[] s(int[] arr) {
        int[] answer = {-1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                int[] answerArr = new int[arr.length - i];

                for (int j = i; j < arr.length; j++) {
                    answerArr[j - i] = arr[j];
                }

                return answerArr;
            }
        }

        return answer;
    }

}
