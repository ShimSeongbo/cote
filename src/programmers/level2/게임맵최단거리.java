package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

class 게임맵최단거리 {
    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        return bfsShortestPath(maps, rows, cols);
    }

    private int bfsShortestPath(int[][] maps, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(0, 0, 1));

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (isAtDestination(current, rows, cols)) {
                return current.distance;
            }

            for (int[] direction : DIRECTIONS) {
                Point nextPoint = current.moveTo(direction);

                if (isWithinBounds(nextPoint, rows, cols) && !visited[nextPoint.x][nextPoint.y] && maps[nextPoint.x][nextPoint.y] == 1) {
                    visited[nextPoint.x][nextPoint.y] = true;
                    queue.offer(nextPoint);
                }
            }
        }

        return -1;
    }

    private boolean isAtDestination(Point point, int rows, int cols) {
        return point.x == rows - 1 && point.y == cols - 1;
    }

    private boolean isWithinBounds(Point point, int rows, int cols) {
        return point.x >= 0 && point.x < rows && point.y >= 0 && point.y < cols;
    }

    static class Point {
        int x, y, distance;

        Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        Point moveTo(int[] direction) {
            return new Point(x + direction[0], y + direction[1], distance + 1);
        }
    }
}


