package programmers.level0;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class 할일목록 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> unfinishedTasks = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                unfinishedTasks.add(todo_list[i]);
            }
        }

        String[] result = new String[unfinishedTasks.size()];
        result = unfinishedTasks.toArray(result);

        return result;
    }

    public String[] solution2(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, todo_list.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }
}
