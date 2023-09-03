package programmers.level2;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);  // 오름차순 정렬
        int maxH = 0;

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;  // 현재 논문 이후의 논문 개수
            if (citations[i] >= h) {  // h 이상 인용된 논문이 h편 이상인지 확인
                maxH = h;  // maxH 업데이트
                break;  // 이미 내림차순으로 정렬되어 있으므로 더 이상 확인할 필요 없음
            }
        }

        return maxH;
    }

}
