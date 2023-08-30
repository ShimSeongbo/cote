package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = Integer.MAX_VALUE;

        // 초기 윈도우 설정
        for (int i = 0; i < k; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        answer = map.size();

        // 슬라이딩 윈도우
        for (int i = k; i < tangerine.length; i++) {
            // 새로운 요소 추가
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);

            // 가장 오래된 요소 제거
            int oldest = tangerine[i - k];
            if (map.get(oldest) == 1) {
                map.remove(oldest);
            } else {
                map.put(oldest, map.get(oldest) - 1);
            }

            answer = Math.min(answer, map.size());
        }

        return answer;
    }
}
