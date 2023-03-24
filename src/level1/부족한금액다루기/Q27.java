package level1.부족한금액다루기;

public class Q27 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(T.solution(price, money, count));
    }
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        if (answer > money) {
            answer -= money;
        } else {
            answer = 0;
        }

        return answer;
    }
}