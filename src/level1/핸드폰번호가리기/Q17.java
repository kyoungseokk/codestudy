package level1.핸드폰번호가리기;

public class Q17 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String phone_number = "01033334444";
        System.out.println(T.solution(phone_number));
    }
}

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }

        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
    }
}