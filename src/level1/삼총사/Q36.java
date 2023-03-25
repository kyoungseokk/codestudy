package level1.삼총사;

public class Q36 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(T.solution(number));
    }
}

class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                    else continue;
                }
            }
        }

        return answer;
    }
}