package level1.내적;

public class Q23 {
    public static void main(String[] args) {

        Solution T = new Solution();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        System.out.println(T.solution(a, b));

    }
}


class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}