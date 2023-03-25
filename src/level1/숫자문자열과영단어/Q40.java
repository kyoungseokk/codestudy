package level1.숫자문자열과영단어;

public class Q40 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "one4seveneight";
        System.out.println(T.solution(s));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        s = s.replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        answer = Integer.parseInt(s);

        return answer;
    }
}