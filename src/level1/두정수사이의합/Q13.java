package level1.두정수사이의합;

public class Q13 {
    public static void main(String[] args) {
        Solution t = new Solution();
        int a = 3;
        int b = 5;
        System.out.println(t.solution(a, b));
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }

        return answer;
    }
}