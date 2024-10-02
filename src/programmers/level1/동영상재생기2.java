package programmers.level1;

public class 동영상재생기2 {

    public class Solution {
        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            int videoDuration = timeToSeconds(video_len);
            int currentPosition = timeToSeconds(pos);
            int opStart = timeToSeconds(op_start);
            int opEnd = timeToSeconds(op_end);

            // 초기 위치가 오프닝 구간에 있으면 오프닝 끝으로 이동
            if (isInOpening(currentPosition, opStart, opEnd)) {
                currentPosition = opEnd;
            }

            // 명령어 처리
            for (String command : commands) {
                if (command.equals("prev")) {
                    currentPosition = Math.max(currentPosition - 10, 0);
                } else if (command.equals("next")) {
                    currentPosition = Math.min(currentPosition + 10, videoDuration);
                }

                // 이동 후 위치가 오프닝 구간에 있으면 오프닝 끝으로 이동
                if (isInOpening(currentPosition, opStart, opEnd)) {
                    currentPosition = opEnd;
                }
            }

            return secondsToTime(currentPosition);
        }

        // "mm:ss" 형식을 초 단위로 변환하는 메서드
        private int timeToSeconds(String time) {
            String[] parts = time.split(":");
            return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }

        // 초를 "mm:ss" 형식의 문자열로 변환하는 메서드
        private String secondsToTime(int totalSeconds) {
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }

        // 현재 위치가 오프닝 구간에 있는지 확인하는 메서드
        private boolean isInOpening(int time, int opStart, int opEnd) {
            return time >= opStart && time <= opEnd;
        }
    }


}
