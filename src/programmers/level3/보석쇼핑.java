package programmers.level3;

import java.util.*;

public class 보석쇼핑 {
    public int[] solution(String[] gems) {
        Set<String> gemTypes = new HashSet<>(Arrays.asList(gems));
        int gemKind = gemTypes.size();

        int start = 0, end = 0;
        Map<String, Integer> gemMap = new HashMap<>();
        int[] answer = {0, Integer.MAX_VALUE}; // 시작과 끝 지점을 저장합니다.

        while (end < gems.length) {
            gemMap.put(gems[end], gemMap.getOrDefault(gems[end], 0) + 1);
            end++;

            while (gemMap.size() == gemKind) { // 현재 구간에 모든 종류의 보석이 포함될 경우
                if (end - start < answer[1] - answer[0]) {
                    answer[0] = start;
                    answer[1] = end;
                }

                gemMap.put(gems[start], gemMap.get(gems[start]) - 1);
                if (gemMap.get(gems[start]) == 0) {
                    gemMap.remove(gems[start]);
                }
                start++;
            }
        }

        return new int[]{answer[0] + 1, answer[1]}; // 1-based index로 변환
    }
}

