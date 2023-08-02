import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] intArr : lines) {
            for (int i = intArr[0]+1 ; i <= intArr[intArr.length-1]; i++) {
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
        
        for(int key : map.keySet()) {
            if(map.get(key) != 1) {
                answer++;       
            }
        }
        return answer;
    }
}