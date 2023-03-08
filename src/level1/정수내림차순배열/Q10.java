package level1.정수내림차순배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q10 {
    public static void main(String[] args) {
        Solution s = new Solution();
        long n = 118372;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n);
        ArrayList<Long> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            arr.add((long) (str.charAt(i) - 48));
        }

        Collections.sort(arr, Collections.reverseOrder());
        str = "";

        for (int i = 0; i < arr.size(); i++) {
            str += arr.get(i);
        }

        answer = Long.parseLong(str);

        return answer;
    }
}