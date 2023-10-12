package programmers.level3;

public class 징검다리건너기 {
    public int solution(int[] stones, int k) {
        int left = 1, right = 200000000, mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (canCross(stones, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    private boolean canCross(int[] stones, int k, int mid) {
        int count = 0;
        for (int stone : stones) {
            if (stone - mid < 0) {
                count++;
                if (count == k) return false;
            } else {
                count = 0;
            }
        }

        return true;
    }

}
