package level1.최소직사각형;

public class Q37 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        System.out.println(T.solution(sizes));
    }
}

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < sizes.length; i++) {
                width = Math.max(sizes[i][0], sizes[i][1]);
                height = Math.min(sizes[i][0], sizes[i][1]);
                sizes[i][0] = width;
                sizes[i][1] = height;

                max = Math.max(max, sizes[i][0]);
                min = Math.max(min, sizes[i][1]);

        }

        answer = max * min;

        return answer;
    }
}