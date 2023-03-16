package level1.약수의개수와덧셈;

public class Q25 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int left = 13;
        int right = 17;

        System.out.println(T.solution(left, right));
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                } else continue;
            }

            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

            count = 0;
        }

        return answer;
    }
}