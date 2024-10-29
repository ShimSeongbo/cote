package programmers.level0;

public class 커피심부름 {

    public int solution(String[] order) {
        int answer = 0;

        for (String menu : order) {
            if (menu.contains("americano")) answer += 4500;
            if (menu.contains("cafelatte")) answer += 5000;
            if (menu.contains("anything")) answer += 4500;
        }

        return answer;
    }
}
