package programmers.level0;

import java.util.Objects;

public class 로그인성공 {

    public String solution(String[] id_pw, String[][] db) {
        for (String[] entry : db) {
            if (checkId(id_pw, entry)) {
                if (checkPassword(id_pw, entry)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    static boolean checkId(String[] id_pw, String[] entry) {
        return Objects.equals(id_pw[0], entry[0]);
    }

    static boolean checkPassword(String[] id_pw, String[] entry) {
        return Objects.equals(id_pw[1], entry[1]);
    }
}

