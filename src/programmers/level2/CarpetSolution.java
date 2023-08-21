package programmers.level2;

public class CarpetSolution {
    public int[] solution(int brown, int yellow) {
        for (int width = 1; width <= Math.sqrt(yellow); width++) {
            // 세로 길이(yellow / width)가 나누어 떨어지면
            if (yellow % width == 0) {
                int height = yellow / width;

                // 테두리 갈색 격자의 수를 계산한다.
                int totalBrown = 2 * (width + height) + 4;

                // 만약 계산한 갈색 격자의 수가 주어진 갈색 격자의 수와 일치하면
                if (totalBrown == brown) {
                    // 가로가 세로보다 크거나 같아야 하므로
                    int[] answer = {Math.max(height, width) + 2, Math.min(height, width) + 2};
                    return answer;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CarpetSolution solution = new CarpetSolution();
        int[] result = solution.solution(10, 2);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        result = solution.solution(8, 1);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        result = solution.solution(24, 24);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
