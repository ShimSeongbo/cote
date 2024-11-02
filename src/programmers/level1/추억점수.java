package programmers.level1;

import java.util.HashMap;

public class 추억점수 {

    /**
     * 사람들의 추억 점수를 계산하는 함수
     *
     * @param name          그리워하는 사람들의 이름을 담은 배열
     * @param yearning      각 사람의 그리움 점수를 담은 배열
     * @param photo         각 사진에 찍힌 인물들의 이름을 담은 이차원 배열
     * @return              각 사진의 추억 점수를 담은 배열
     */
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();

        for (int n = 0; n < name.length; n++) {
            map.put(name[n], yearning[n]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;

            for (String s : photo[i]) {
                sum += map.getOrDefault(s, 0);
            }

            answer[i] = sum;
        }

        return answer;
    }
}
