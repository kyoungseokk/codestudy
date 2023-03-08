package level1.문자열을정수로만들기;

public class Q9 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "-1234";
        System.out.println(s.solution(str));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }
}