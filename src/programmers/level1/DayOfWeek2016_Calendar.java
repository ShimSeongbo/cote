package programmers.level1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek2016_Calendar {

    /**
     * 2016년 a월 b일의 요일을 반환하는 함수.
     *
     * @param a 월 (1 ≤ a ≤ 12)
     * @param b 일 (1 ≤ b ≤ 31, 각 월에 실제로 존재하는 날짜)
     * @return 해당 날짜의 요일 ("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
     */
    public String solution(int a, int b) {
        // 자바의 Calendar는 월이 0부터 시작하므로, a - 1을 사용
        Calendar cal = new GregorianCalendar(2016, a - 1, b);

        // 요일을 정수로 가져옴 (1: 일요일, 2: 월요일, ..., 7: 토요일)
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // 요일 배열
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        return days[dayOfWeek - 1];
    }
}
