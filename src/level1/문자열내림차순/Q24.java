package level1.문자열내림차순;

import java.util.ArrayList;
import java.util.Collections;

public class Q24 {
    public static void main(String[] args) {

        Solution T = new Solution();
        String s = "Zbcdefg";

        System.out.println(T.solution(s));

    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
                arrayList.add(s.charAt(i));
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        for (int i = 0; i < arrayList.size(); i++) {
            answer += String.valueOf(arrayList.get(i));
        }

        return answer;
    }
}