package programmers.level0;

import java.util.ArrayList;

class 다섯명씩 {
    public String[] solution(String[] names) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            result.add(names[i]);
        }

        return result.toArray(new String[0]);
    }
}

