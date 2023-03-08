package level1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q19 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(T.solution(arr)));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if (answer.length == 0) {
            return new int[]{-1};
        } else {
            int[] temp = arr.clone();
            ArrayList<Integer> arrayList = new ArrayList<>();
            Arrays.sort(temp);
            int min = temp[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    arrayList.add(arr[i]);
                }
            }

            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }

        }

        return answer;
    }
}