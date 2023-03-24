package level1.같은숫자는싫어;

import java.util.ArrayList;

public class Q31 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(T.solution(arr));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) continue;
            else {
                arrayList.add(arr[i]);
            }
        }

        answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}