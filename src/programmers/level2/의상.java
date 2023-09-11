package programmers.level2;

import java.util.HashMap;

class 의상 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;

        for (int val : map.values()) {
            answer *= (val + 1);
        }

        return answer - 1;
    }
}
