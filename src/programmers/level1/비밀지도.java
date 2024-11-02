package programmers.level1;

public class 비밀지도 {

    public static void main(String[] args) {
        String format = String.format("%" + 5 + "s", "1111").replace(' ', '0');
        System.out.println("format = " + format);
    }

    /**
     * 비밀지도를 해독하는 함수.
     *
     * @param n         지도의 한 변의 크기
     * @param arr1      첫 번째 지도 배열
     * @param arr2      두 번재 지도 배열
     * @return          해독된 비밀지도
     */
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] secretMap = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];

            String binaryStr = Integer.toBinaryString(combined);
            binaryStr = String.format("%" + n + "s", binaryStr).replace(' ', '0');

            StringBuilder sb = new StringBuilder();
            for (char c : binaryStr.toCharArray()) {
                if (c == '1') {
                    sb.append('#');
                } else {
                    sb.append(' ');
                }
            }

            secretMap[i] = sb.toString();
        }

        return secretMap;
    }
}
