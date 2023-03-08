package level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q16 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(T.solution(arr, divisor)));
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ans.add(arr[i]);
            }
        }

        Collections.sort(ans);
        answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}