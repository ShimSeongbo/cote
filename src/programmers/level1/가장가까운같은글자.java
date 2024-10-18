package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class 가장가까운같은글자 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; i<=1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }

    public static void main2(String[] args) {
        String s = "foobar";
        System.out.println(solution(s)[5]);
    }

    public static int[] solution(String s) {
        List<Integer> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String substring = String.valueOf(s.charAt(i));

            if (map.containsKey(substring)) {
                int length = i - map.get(substring);
                map.put(substring, i);
                list.add(length);
            } else {
                map.put(substring, i);
                list.add(-1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(String s) {
        int[] result = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar)) {
                int lastIndex = map.get(currentChar);
                result[i] = i - lastIndex;
                map.put(currentChar, i);
            } else {
                map.put(currentChar, i);
                result[i] = -1;
            }
        }

        return result;
    }
}

