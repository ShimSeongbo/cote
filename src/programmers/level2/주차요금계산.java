package programmers.level2;

import java.util.*;

class 주차요금계산 {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> inTime = new HashMap<>(); // 차량별 입차 시간
        HashMap<String, Integer> totalTime = new HashMap<>(); // 차량별 총 주차 시간

        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];
            String car = parts[1];
            String status = parts[2];

            // 시간을 분 단위로 변환
            int mins = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);

            if (status.equals("IN")) {
                inTime.put(car, mins);
            } else {
                totalTime.put(car, totalTime.getOrDefault(car, 0) + (mins - inTime.get(car)));
                inTime.remove(car);
            }
        }

        // 출차 기록이 없는 차량에 대한 처리
        for (String car : inTime.keySet()) {
            totalTime.put(car, totalTime.getOrDefault(car, 0) + (1439 - inTime.get(car)));
        }

        // 요금 계산
        List<String> cars = new ArrayList<>(totalTime.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];

        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            int time = totalTime.get(car);
            if (time <= fees[0]) {
                answer[i] = fees[1];
            } else {
                answer[i] = fees[1] + (int)Math.ceil((double)(time - fees[0]) / fees[2]) * fees[3];
            }
        }

        return answer;
    }
}

