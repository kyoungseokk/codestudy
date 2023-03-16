package level1.문자열다루기기본;

public class Q26 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "a234";

        System.out.println(T.solution(s));
    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }

        return answer;
    }
}