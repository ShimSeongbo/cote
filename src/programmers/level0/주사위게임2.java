package programmers.level0;

import java.util.HashSet;
import java.util.Set;

public class 주사위게임2 {

    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        int size = set.size();

        switch (size) {
            case 3 -> { return a + b + c; }
            case 2 -> { return (a + b + c) * (a*a + b*b + c*c); }
            case 1 -> { return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c); }
        }

        return 0;
    }
}
