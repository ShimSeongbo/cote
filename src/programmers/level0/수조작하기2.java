package programmers.level0;

public class 수조작하기2 {

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }

    /**
     * 문제를 풀기위해 for-loop 를 이용하여, 각 요소들을 탐색했습니다.
     * 각 요소를 탐색하면서, 현재 인덱스와 이전 인덱스를 비교하여, 차이를 계산한 후 커맨드를 결정하였습니다.
     * 이 커맨드를 스위치 케이스로 처리하여, 마지막으로 StringBuilder를 이용하여 반환하였습니다.
     */
    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int commands = 0;

        for (int i = 1; i < numLog.length; i++) {
            commands = numLog[i] - numLog[i - 1];

            switch (commands) {
                case 1 -> sb.append("w");
                case -1 -> sb.append("s");
                case 10 -> sb.append("d");
                case -10 -> sb.append("a");
            }
        }

        return sb.toString();
    }
}
