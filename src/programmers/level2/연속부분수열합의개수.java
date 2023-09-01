package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        Set<Integer> uniqueSums = new HashSet<>();
        int n = elements.length;

        // 원형 수열이기 때문에 시작 인덱스를 0부터 n-1까지 검사
        for (int start = 0; start < n; start++) {
            int sum = 0;

            // 연속 부분 수열의 길이를 1부터 n까지 검사
            for (int length = 1; length <= n; length++) {
                sum += elements[(start + length - 1) % n]; // 원형 수열의 연속 합 계산
                uniqueSums.add(sum); // 합을 HashSet에 저장 (중복은 자동으로 제거됨)
            }
        }

        return uniqueSums.size(); // 유일한 합의 개수를 반환
    }
}
