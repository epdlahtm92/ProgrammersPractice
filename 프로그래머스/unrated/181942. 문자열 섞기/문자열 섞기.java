import java.util.*;

class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        int j = 0;
        int k = 0;
        for (int i = 0; i < str1.length()*2; i++) {
            if (i % 2 == 0) {
                answer.append(str1.substring(j, j+1));
                j++;
                } else {
                answer.append(str2.substring(k, k+1));
                k++;
            }
        }
        return answer.toString();
    }
}