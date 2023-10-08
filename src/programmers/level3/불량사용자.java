package programmers.level3;

import java.util.*;

class 불량사용자 {
    List<Set<String>> results = new ArrayList<>();

    public int solution(String[] user_id, String[] banned_id) {
        dfs(0, user_id, banned_id, new HashSet<>());
        return results.size();
    }

    public void dfs(int index, String[] user_id, String[] banned_id, Set<String> banned) {
        if (index == banned_id.length) {
            if (isUniqueSet(banned)) {
                results.add(new HashSet<>(banned));
            }
            return;
        }

        for (String user : user_id) {
            if (isMatch(user, banned_id[index])) {
                if (!banned.contains(user)) {
                    banned.add(user);
                    dfs(index + 1, user_id, banned_id, banned);
                    banned.remove(user);
                }
            }
        }
    }

    public boolean isMatch(String s, String pattern) {
        if (s.length() != pattern.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (pattern.charAt(i) != '*' && pattern.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isUniqueSet(Set<String> banned) {
        for (Set<String> result : results) {
            if (result.equals(banned)) return false;
        }
        return true;
    }
}
