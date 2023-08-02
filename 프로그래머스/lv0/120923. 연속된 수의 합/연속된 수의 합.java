import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> answer = new ArrayList<>();
        for (int i = -100; i < 1000; i++) {
            int res = 0;
            for (int j = i; j < i+num; j++) {
                res += j;
            }
            if (res == total) {
                for (int j = i; j < i+num; j++) {
                    answer.add(j);
                }
            }
                
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}