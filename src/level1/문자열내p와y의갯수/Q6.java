package level1.문자열내p와y의갯수;

public class Q6 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String str = "pPoooyY";
        System.out.println(s.solution(str));

    }
}

class Solution { // p일때 +1 y일때 -1로 count == 0인지 확인하는 것도 하나의 방법
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        int countp = 0;
        int county = 0;

        for (char x : s.toCharArray()) {
            if (x == 'p') {
                countp += 1;
            } else if (x == 'y') {
                county += 1;
            }
        }

        if (countp == county) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}