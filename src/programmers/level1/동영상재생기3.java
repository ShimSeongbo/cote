package programmers.level1;

public class 동영상재생기3 {

    private static final int SKIP_SECONDS = 10;

    class Solution {
        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            int videoDuration = timeToSeconds(video_len);
            int currentPosition = timeToSeconds(pos);
            int openingStart = timeToSeconds(op_start);
            int openingEnd = timeToSeconds(op_end);

            if (isWithinOpening(currentPosition, openingStart, openingEnd)) {
                currentPosition = openingEnd;
            }

            for (String command : commands) {
                switch (command) {
                    case "prev" :
                        currentPosition = Math.max(currentPosition - SKIP_SECONDS, 0);
                        break;
                    case "next" :
                        currentPosition = Math.min(currentPosition + SKIP_SECONDS, videoDuration);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid command: " + command);
                }

                if (isWithinOpening(currentPosition, openingStart, openingEnd)) {
                    currentPosition = openingEnd;
                }
            }

            return secondsToTime(currentPosition);
        }

        private int timeToSeconds(String time) {
            String[] parts = time.split(":");

            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid time format: " + time);
            }

            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);

            if (minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
                throw new IllegalArgumentException("Invalid time value: " + time);
            }

            return minutes * 60 + seconds;
        }

        private String secondsToTime(int totalSeconds) {
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;

            return String.format("%02d:%02d", minutes, seconds);
        }

        private boolean isWithinOpening(int position, int openingStart, int openingEnd) {
            return position >= openingStart && position <= openingEnd;
        }
    }









    class Solution2 {
        private static final int SKIP_TEN_SECONDS = 10;

        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
            int videoDurationInSeconds = timeToSeconds(video_len);
            int currentPosition = timeToSeconds(pos);
            int openingStartTime = timeToSeconds(op_start);
            int openingEndTime = timeToSeconds(op_end);

            if (isWithOpening(currentPosition, openingStartTime, openingEndTime)) {
                currentPosition = openingEndTime;
            }

            for (String command : commands) {
                switch (command) {
                    case "prev" -> currentPosition = Math.max(currentPosition - SKIP_TEN_SECONDS, 0);
                    case "next" -> currentPosition = Math.min(currentPosition + SKIP_TEN_SECONDS, videoDurationInSeconds);
                    default -> throw new IllegalArgumentException("Invalid command: " + command);
                }

                if (isWithOpening(currentPosition, openingStartTime, openingEndTime)) {
                    currentPosition = openingEndTime;
                }
            }

            return secondsToTime(currentPosition);
        }

        private String secondsToTime(int totalSeconds) {
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;

            return String.format("%02d:%02d", minutes, seconds);
        }

        private boolean isWithOpening(int currentPosition, int openingStartTime, int openingEndTime) {
            return openingStartTime <= currentPosition && currentPosition <= openingEndTime;
        }

        private int timeToSeconds(String time) {
            String[] parts = time.split(":");

            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid time format: " + time);
            }

            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);

            if (minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
                throw new IllegalArgumentException("Invalid time value: " + time);
            }

            return minutes * 60 + seconds;
        }
    }
}
