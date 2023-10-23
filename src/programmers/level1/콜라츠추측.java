package programmers.level1;

public class 콜라츠추측 {

    public int solution(int num) {
        long answer = num;

        if (answer == 1) {
            return 0;
        }

        for (int i = 0; i < 500; i++) {
            if (answer == 1) {
                return i;
            }
            if (isEvenNumber(answer)) {
                answer = answer / 2;
            } else {
                answer = (answer * 3) + 1;
            }
        }

        return -1;
    }

    private static boolean isEvenNumber (long number) {
        return number % 2 == 0;
    }
}
