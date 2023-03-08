package level1.나머지가1이되는수찾기;

public class Q11 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 10;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}