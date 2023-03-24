package level1.예산;

import java.util.ArrayList;
import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(T.solution(d, budget));
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget - d[answer] >= 0) {
                budget -= d[answer++];
            } else break;
        }

        return answer;
    }
}