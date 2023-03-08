package level1.콜라츠추측;

public class Q14 {
    public static void main(String[] args) {
        Solution t = new Solution();
        int num = 626331;
        System.out.println(t.solution(num));
    }
}

class Solution {
    public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                if (num / 2 < 0) {
                    answer++;
                    continue;
                } else {
                    num /= 2;
                    answer++;
                }
            } else {
                num = num * 3 + 1;
                answer++;
            }

            if (answer == 500) {
                return -1;
            }
        }

        return answer;
    }
}