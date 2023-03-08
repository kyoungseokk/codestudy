package level1.짝수와홀수;

public class Q1_짝수와홀수 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int num = 4;
        System.out.println(s.solution(num));

    }
}

class Solution {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}