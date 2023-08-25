package programmers.level2;

import java.util.HashSet;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);  // 배열을 오름차순으로 정렬
        
        int start = 0;
        int end = people.length - 1;
        
        while (start <= end) {
            // 가장 무거운 사람과 가장 가벼운 사람을 함께 태울 수 있는 경우
            if (people[start] + people[end] <= limit) {
                start++;
            }
            // 가장 무거운 사람만 태우고, 다음으로 무거운 사람을 확인
            end--;
            answer++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;
        System.out.println(solution.solution(people1, limit1));  // 출력: 3
        
        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        System.out.println(solution.solution(people2, limit2));  // 출력: 3
    }
}
