package programmers.level0;

public class 삼육구게임 {

    /**
     * 1. 문제요약
     *  - 주어진 숫자 중 3, 6, 9 개수만큼 박수를 치는 게임.
     * 2. 제한사항
     * 3. 풀이전략
     *  - 주어진 숫자를 문자로 변환 후, 3, 6, 9 의 개수를 카운팅
     * 4. 세부구현
     *  - for-loop 를 이용하여 문자를 하나씩 탐색 후 카운팅한 숫자를 반환함.
     *
     */
    public int solution(int order) {
        int answer = 0;
        String intToStringOrder = order + "";

        for (int i = 0; i < intToStringOrder.length(); i++) {
            char c = intToStringOrder.charAt(i);

            if (c == '3' || c == '6' || c == '9') {
                answer += 1;
            }
        }

        return answer;
    }
}
