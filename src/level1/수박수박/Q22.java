package level1.수박수박;

public class Q22 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 3;

        System.out.println(T.solution(n));
    }
}

class Solution {
    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }

        return answer;
    }
}