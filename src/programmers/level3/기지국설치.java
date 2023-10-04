package programmers.level3;

public class 기지국설치 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int lastCovered = 0; // 마지막으로 커버된 아파트 번호

        for (int station : stations) {
            int startCoverage = station - w;
            int endCoverage = station + w;

            // 이전 기지국이 커버하지 못한 부분에 대해 필요한 기지국의 수 계산
            if (lastCovered < startCoverage - 1) {
                int gap = startCoverage - lastCovered - 1;
                int neededStations = (int) Math.ceil((double) gap / (2 * w + 1));
                answer += neededStations;
            }

            // 현재 기지국이 커버하는 마지막 아파트 번호를 갱신
            lastCovered = endCoverage;
        }

        // 마지막 기지국 이후 커버되지 않은 아파트에 대해 필요한 기지국의 수 계산
        if (lastCovered < n) {
            int gap = n - lastCovered;
            int neededStations = (int) Math.ceil((double) gap / (2 * w + 1));
            answer += neededStations;
        }

        return answer;
    }

}
