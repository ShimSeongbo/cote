package programmers.level0;

import java.util.*;

public class 진료순서정하기 {

    public int[] bestPractice(int[] emergency) {
        int[] result = new int[emergency.length];
        int[] sortedEmergency = emergency.clone();

        Arrays.sort(sortedEmergency);
        for (int i = 0; i < sortedEmergency.length / 2; i++) {
            int temp = sortedEmergency[i];
            sortedEmergency[i] = sortedEmergency[sortedEmergency.length - 1 - i];
            sortedEmergency[sortedEmergency.length - 1 - i] = temp;
        }

        for (int i = 0; i< sortedEmergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] == sortedEmergency[i]) {
                    result[j] = i + 1;
                    break;
                }
            }
        }

        return result;
    }

    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];

        List<Integer> list = new ArrayList<>();
        for (int i : emergency) {
            list.add(i);
        }

        list.sort(Comparator.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(emergency[i]);
        }

        return result;
    }
}
