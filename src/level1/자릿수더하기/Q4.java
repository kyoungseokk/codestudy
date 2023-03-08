package level1.자릿수더하기;

public class Q4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 123;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int res = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}