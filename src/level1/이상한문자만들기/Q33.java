package level1.이상한문자만들기;

import java.util.Arrays;

public class Q33 {
    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "try hello world";
        System.out.println(T.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ", -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) answer += String.valueOf(arr[i].charAt(j)).toUpperCase();
                else answer += String.valueOf(arr[i].charAt(j)).toLowerCase();
            }

            if (i < arr.length - 1) answer += " ";
        }

        return answer;
    }
}