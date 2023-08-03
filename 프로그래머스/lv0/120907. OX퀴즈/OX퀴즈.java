import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for (String str: quiz) {
            String[] cal = str.split(" ");
            int res = 0;
            if (cal[1].equals("+")) {
                res = Integer.parseInt(cal[0]) + Integer.parseInt(cal[2]);
            } else {
                res = Integer.parseInt(cal[0]) - Integer.parseInt(cal[2]);
            }
            if (res == Integer.parseInt(cal[4])) {
                answer.add("O");
            } else {
                answer.add("X");
            }
            
        }
        String[] answerStr = new String[quiz.length];
        for (int i = 0; i < answer.size(); i++) {
            answerStr[i] = answer.get(i);
        }
        return answerStr;
    }
}