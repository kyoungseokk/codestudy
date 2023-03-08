package level1.하샤드수;

public class Q12 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int x = 10;
        System.out.println(s.solution(x));
    }
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int dev = x;

        while (dev > 0) {
            sum += dev % 10;
            dev /= 10;
        }

        if (x % sum == 0) {
            return answer;
        } else {
            return false;
        }

    }
}