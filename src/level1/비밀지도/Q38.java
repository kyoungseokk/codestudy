package level1.비밀지도;

import java.util.Arrays;

public class Q38 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(T.solution(n, arr1, arr2)));
    }
}

// "#####",
// "# # #",
// "### #",
// "# ## ",
// "#####"

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] starr1 = new String[n];
        String[] starr2 = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = "";
        }

        for (int i = 0; i < n; i++) {
            starr1[i] = Integer.toString(arr1[i], 2);
            starr2[i] = Integer.toString(arr2[i], 2);

            while (starr1[i].length() != n) {
                starr1[i] = "0" + starr1[i];
            }

            while (starr2[i].length() != n) {
                starr2[i] = "0" + starr2[i];
            }

            for (int j = 0; j < starr1[i].length(); j++) {
                if (starr1[i].charAt(j) == '1' || starr2[i].charAt(j) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }

        }

        return answer;
    }
}