package level1.가운데글자가져오기;

public class Q21 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "abcde";

        System.out.println(T.solution(s));

    }
}


class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            answer = String.valueOf(s.charAt(s.length() / 2 - 1)) + String.valueOf(s.charAt(s.length() / 2)) ;
        } else {
            answer = String.valueOf(s.charAt(s.length() / 2));
        }

        return answer;
    }
}