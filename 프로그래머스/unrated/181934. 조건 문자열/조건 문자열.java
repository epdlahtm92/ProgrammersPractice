class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        int res = n - m;
        if(ineq.equals("<") && eq.equals("=")) {
            if (res <= 0) answer = 1;
        }
         if(ineq.equals("<") && eq.equals("!")) {
            if (res < 0) answer = 1;
        }
         if(ineq.equals(">") && eq.equals("=")) {
            if (res >= 0) answer = 1;
        }
         if(ineq.equals(">") && eq.equals("!")) {
            if (res > 0) answer = 1;
        }
        return answer;
    }
}