package programmers.level3;

import java.util.*;

public class 여행경로 {
    public String[] solution(String[][] tickets) {
        boolean[] visited = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1])); // 목적지 기준 정렬
        String[] answer = new String[tickets.length + 1];
        dfs("ICN", tickets, visited, answer, 0);
        return answer;
    }

    private boolean dfs(String current, String[][] tickets, boolean[] visited, String[] answer, int count) {
        answer[count] = current;

        if (count == tickets.length) {
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                if (dfs(tickets[i][1], tickets, visited, answer, count + 1)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }

    public String[] solution2(String[][] tickets) {
        // 티켓을 목적지 기준으로 정렬
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));

        // 각 공항에서 출발하는 티켓의 리스트를 저장
        Map<String, Queue<String>> graph = new HashMap<>();
        for (String[] ticket : tickets) {
            graph.computeIfAbsent(ticket[0], k -> new LinkedList<>()).add(ticket[1]);
        }

        List<String> path = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("ICN");

        while (!stack.isEmpty()) {
            String node = stack.peek();
            if (graph.containsKey(node) && !graph.get(node).isEmpty()) {
                stack.push(graph.get(node).poll());
            } else {
                path.add(stack.pop());
            }
        }

        Collections.reverse(path);
        return path.toArray(new String[0]);
    }
}
