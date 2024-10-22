package programmers.level0;

public class 숫자찾기 {

    public int solution(int num, int k) {
        String s = Integer.toString(num);
        String target = Integer.toString(k);

        int index = s.indexOf(target);

        return (index == -1) ? -1 : index + 1;
    }
}
