package programmers.level2;

/**
 *  LRU (Least Recently Used) 캐시 알고리즘을 구현
 */
import java.util.LinkedList;

class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        if (cacheSize == 0) return 5 * cities.length;

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.remove(city)) {
                cache.addFirst(city);
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeLast();
                }
                cache.addFirst(city);
                answer += 5;
            }
        }

        return answer;
    }
}

