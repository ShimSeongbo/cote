package programmers.level2;

import java.util.Arrays;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        // 전화번호부 정렬
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++) {
            // 접두사 확인
            if(phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        전화번호목록 s = new 전화번호목록();

        System.out.println(s.solution(new String[]{"119", "97674223", "1195524421"}));  // false
        System.out.println(s.solution(new String[]{"123", "456", "789"}));  // true
        System.out.println(s.solution(new String[]{"12", "123", "1235", "567", "88"}));  // false
    }
}
