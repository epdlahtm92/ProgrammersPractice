import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp1 = s.split(" ");
        int[] tmp2 = new int[tmp1.length];
        
        for(int i = 0; i < tmp1.length; i++) {
            tmp2[i] = Integer.parseInt(tmp1[i]);
        }
        
        Arrays.sort(tmp2);
        
        answer = tmp2[0] + " " + tmp2[tmp2.length - 1];
        
        return answer;
    }
}