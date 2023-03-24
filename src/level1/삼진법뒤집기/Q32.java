package level1.삼진법뒤집기;

public class Q32 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 45;
        System.out.println(T.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        StringBuilder convert = new StringBuilder(Integer.toString(n, 3));
        StringBuilder convert2 = new StringBuilder(convert.reverse());
        answer = Integer.parseInt(String.valueOf(convert2), 3);

        return answer;
    }
}