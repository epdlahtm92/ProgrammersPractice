import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        Map<Character, Integer> mapB = new HashMap<>();
        Map<Character, Integer> mapA = new HashMap<>();
        
        for (char c : before.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }
        for (char c : after.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }
        int cnt = 0;
        for (char c : mapA.keySet()) {
            if (mapB.get(c) != mapA.get(c)){
                cnt++;
            }
        }
        
        if (cnt > 0) {
            answer = 0;
        }
        return answer;
    }
}