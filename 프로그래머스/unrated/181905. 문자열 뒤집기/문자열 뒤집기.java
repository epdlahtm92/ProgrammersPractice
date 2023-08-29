import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp1 = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(tmp1);
        sb.reverse();
        answer += my_string.substring(0,s);
        answer += sb.toString();
        answer += my_string.substring(e+1, my_string.length());
        System.out.println(answer);
        System.out.println(sb);
    
        return answer;
    }
}