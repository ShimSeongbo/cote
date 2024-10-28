package programmers.level0;

public class 컨트롤제트 {

    // 스택 활용 풀이 추가 예정
    public int solution(String s) {
        int answer = 0;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length - 1; i++) {
            if (!split[i + 1].equals("Z") && !split[i].equals("Z")) {
                answer += Integer.parseInt(split[i]);
            }
        }

        if (!split[split.length - 1].equals("Z")) {
            answer += Integer.parseInt(split[split.length - 1]);
        }

        return answer;
    }
}
