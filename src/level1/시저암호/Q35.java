package level1.시저암호;

public class Q35 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "AB";
        int n = 1;
        System.out.println(T.solution(s, n));
    }
}

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (char x : s.toCharArray()) {
            if (Character.isLowerCase(x)) {
                x = (char) ((x - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(x)){
                x = (char) ((x - 'A' + n) % 26 + 'A');
            } else {
                x = ' ';
            }

            answer += x;
        }

        return answer;
    }
}