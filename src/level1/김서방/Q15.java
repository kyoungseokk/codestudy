package level1.김서방;

public class Q15 {
    public static void main(String[] args) {
        Solution t = new Solution();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(t.solution(seoul));
    }
}

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}