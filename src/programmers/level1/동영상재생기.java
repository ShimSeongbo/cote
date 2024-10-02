package programmers.level1;

public class 동영상재생기 {

    class Solution {
        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            /*
             video_len = 동영상의 길이
             pos = 재생위치 문자열
             op_start = 오프닝 시작 시각
             op_end = 오프닝 끝나는 시각

             문자열 -> 초로 변환
             초 -> 문자열로 변환 (배열 써서 반환: 배열 초기화 0 0 0 0 덮어쓰기.)

             commands = 커맨드들
             */
            int videoDuration = StringToSecond(video_len);
            int posTime = StringToSecond(pos);
            int opStartTime = StringToSecond(op_start);
            int opEndTime = StringToSecond(op_end);
            int moveTime = inputCommandstrans(commands);
            // 시작시간
            if ((posTime + moveTime) <= 0) {
                return "00:00";
            }

            // 종료시간
            if ((posTime + moveTime) >= videoDuration) {
                return video_len;
            }

            int 이동완료시간 = (posTime + moveTime);

            // 오프닝 스킵
            if ((opStartTime <= posTime) && (posTime <= opEndTime)) {

                return 이동완료시간ToString((opEndTime + moveTime));
            }

            if ((opStartTime <= 이동완료시간) && (이동완료시간 <= opEndTime)) {

                return op_end;
            }

            return 이동완료시간ToString(이동완료시간);
        }

        // 1. 커맨드 확인하는 메서드
        private int inputCommandstrans(String[] commands) {
            int result = 0;

            for (String command : commands) {
                if (command.equals("prev")) {
                    result -= 10;
                }

                if (command.equals("next")) {
                    result += 10;
                }
            }

            return result;
        }

        private int StringToSecond(String string) {
            int result = 0;

            String[] split = string.split(":");
            String min = split[0];
            String sec = split[1];

            if (min.equals("00")) {
                return Integer.parseInt(sec);
            }

            int i = Integer.parseInt(min);
            result += i * 60;

            int j = Integer.parseInt(sec);
            result += j;

            return result;
        }

        private String 이동완료시간ToString(int 이동완료시간) {
            String resultMin = "";
            String resultSec = "";
            int min = 이동완료시간 / 60;
            int sec = 이동완료시간 % 60;
            if (min < 10) {
                resultMin = "0" + min;
            } else {
                resultMin += min;
            }

            if (sec < 10) {
                resultSec = "0" + sec;
            } else {
                resultSec += sec;
            }


            return resultMin + ":" + resultSec;
        }
    }


}
