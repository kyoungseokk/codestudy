package level1.문자열내마음대로정렬;

import java.util.Arrays;

public class Q39 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(T.solution(strings, n)));
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }

        return answer;
    }
}