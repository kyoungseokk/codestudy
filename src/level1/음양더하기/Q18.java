package level1.음양더하기;

public class Q18 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(T.solution(absolutes, signs));
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}