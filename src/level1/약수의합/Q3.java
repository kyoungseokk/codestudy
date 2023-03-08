package level1.약수의합;

public class Q3 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int n = 12;
        System.out.println(s.solution(n));

    }
}

class Solution { // n의 반까지 돌고 더한 합에 + n
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        answer += n;

        return answer;
    }
}
