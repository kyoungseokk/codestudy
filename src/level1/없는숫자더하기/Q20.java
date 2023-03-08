package level1.없는숫자더하기;

public class Q20 {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(T.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}