package programmers.level0;

import java.util.Arrays;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class GroupedByLength {
    public int groupedByLength(String[] strArr) {

        return (int) Arrays.stream(strArr)
                .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                .values()
                .stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);
    }
}
