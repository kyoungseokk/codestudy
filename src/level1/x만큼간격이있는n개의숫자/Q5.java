package level1.x만큼간격이있는n개의숫자;

public class Q5 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = -4;
        int n = 2;

        for (long t : s.solution(x, n)) {
            System.out.print(t + " ");
        }
    }
}

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        if (n == 0) {
            return answer;
        }

        answer[0] = x;
        long increase = x;

        for (int i = 1; i < n; i++) {
            x += increase;
            answer[i] = x;
        }

        return answer;
    }
}