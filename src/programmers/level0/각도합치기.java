package programmers.level0;

import java.util.Scanner;

public class 각도합치기 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        result = sum_angle % 360;
        System.out.println(result);
    }
}