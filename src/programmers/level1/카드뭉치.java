package programmers.level1;

public class 카드뭉치 {

    /**
     * 목표 단어 배열을 만들 수 있는지 판단하는 함수
     *
     * @param cards1    첫 번째 카드 뭉치의 단어 배열
     * @param cards2    두 번째 카드 뭉치의 단어 배열
     * @param goal      만들고자 하는 목표 단어 배열
     * @return          목표 단어 배열을 만들 수 있으면 "Yes", 아니면 "No"
     */
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;

        for (String str : goal) {
            if (a < cards1.length && cards1[a].equals(str)) {
                a++;
            }

            else if (b < cards2.length && cards2[b].equals(str)) {
                b++;
            }

            else {
                return "No";
            }
        }

        return "Yes";
    }
}
