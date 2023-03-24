package level1.최대공약수최소공배수;

import java.util.Arrays;

public class Q30 {
    public static void main(String[] args) {

        Solution T = new Solution();
        int n = 1;
        int m = 2;
        System.out.println(Arrays.toString(T.solution(n, m)));

    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int lcm = n * m;

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int res = 0;

        while (min != 0) {
            res = max % min;
            max = min;
            min = res;
        }

        answer[0] = max;
        answer[1] = lcm / max;

        return answer;
    }
}