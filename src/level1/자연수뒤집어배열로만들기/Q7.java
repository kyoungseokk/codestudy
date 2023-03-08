package level1.자연수뒤집어배열로만들기;

public class Q7 {
    public static void main(String[] args) {

        Solution s = new Solution();
        long n = 12345;
        for (int x : s.solution(n)) {
            System.out.print(x + " ");
        }

    }
}

class Solution {
    public int[] solution(long n) {

        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}