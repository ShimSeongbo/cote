package programmers.level2;

import java.util.*;

class 뉴스클러스터링 {

    public static Map<String, Integer> generateMultiSet(String str) {
        Map<String, Integer> multiSet = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.matches("[a-z]{2}")) {
                multiSet.put(sub, multiSet.getOrDefault(sub, 0) + 1);
            }
        }
        return multiSet;
    }

    public static int calculateIntersection(Map<String, Integer> set1, Map<String, Integer> set2) {
        int intersectionSize = 0;
        for (String key : set1.keySet()) {
            if (set2.containsKey(key)) {
                intersectionSize += Math.min(set1.get(key), set2.get(key));
            }
        }
        return intersectionSize;
    }

    public static int calculateUnion(Map<String, Integer> set1, Map<String, Integer> set2) {
        int unionSize = 0;
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(set1.keySet());
        allKeys.addAll(set2.keySet());

        for (String key : allKeys) {
            int count1 = set1.getOrDefault(key, 0);
            int count2 = set2.getOrDefault(key, 0);
            unionSize += Math.max(count1, count2);
        }
        return unionSize;
    }

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = generateMultiSet(str1);
        Map<String, Integer> map2 = generateMultiSet(str2);

        int interSize = calculateIntersection(map1, map2);
        int unionSize = calculateUnion(map1, map2);

        double jaccard = (unionSize == 0) ? 1 : (double) interSize / unionSize;

        return (int) (jaccard * 65536);
    }
}
