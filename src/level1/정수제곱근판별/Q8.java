package level1.정수제곱근판별;

public class Q8 {
    public static void main(String[] args) {
        Solution s = new Solution();
        long n = 17;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;

        long x = (long) Math.sqrt(n);

        if (n % x == 0) {
            answer = (x + 1) * (x + 1);
        } else {
            return -1;
        }

        return answer;
    }
}

//class Solution {
//    public long solution(long n) {
//        long answer = 0;
//
//        for (long i=0; i*i<=n; i++) {
//            if(i*i == n) {
//                answer = (i+1)*(i+1);
//            } else {
//                answer = -1;
//            }
//
//        }
//
//        return answer;
//    }
//}