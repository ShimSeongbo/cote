package programmers.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 기본적으로 최소 힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙으로 변경

        for(String op : operations) {
            String[] split = op.split(" ");
            String command = split[0];
            int num = Integer.parseInt(split[1]);

            if(command.equals("I")) {
                minHeap.add(num);
                maxHeap.add(num);
            } else {
                if(num == 1 && !maxHeap.isEmpty()) { // 최댓값 삭제
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                } else if(num == -1 && !minHeap.isEmpty()) { // 최솟값 삭제
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }

        if(minHeap.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxHeap.poll(), minHeap.poll()};
        }
    }

    public static void main(String[] args) {
        DoublePriorityQueue dpq = new DoublePriorityQueue();
        int[] result1 = dpq.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});
        int[] result2 = dpq.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});

        System.out.println(result1[0] + ", " + result1[1]); // Output: 0, 0
        System.out.println(result2[0] + ", " + result2[1]); // Output: 333, -45
    }
}
