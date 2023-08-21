package programmers.level1;

import java.util.stream.LongStream;

/**
 * <문제>
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 */
public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
    }
}
