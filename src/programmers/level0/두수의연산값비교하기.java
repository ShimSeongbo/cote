package programmers.level0;

public class 두수의연산값비교하기 {

    /**
     * 두 정수를 붙여서 만든 값과 2ab로 만든 값 두 수를 비교합니다.
     * 첫번째 케이스에선 a 와 b를 붙이고, 정수로 변환합니다.
     * 두번째 케이스에선 2 * a * b 준비했습니다.
     * 마지막으로 삼항연산자를 이용해 두 값을 비교하고, 더 큰 값을 반환했습니다. 두 수가 같은 경우 케이스 1을 반환.
     */
    public int solution(int a, int b) {
        int case1 = Integer.parseInt(a + "" + b);
        int case2 = 2 * a * b;

        return case1 >= case2 ? case1 : case2;
    }
}
