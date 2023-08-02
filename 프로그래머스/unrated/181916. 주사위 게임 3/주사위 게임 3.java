import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int[] intArr = {a, b, c, d};
        for (int i : intArr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        
        if (map.values().contains(4)) {
            answer = list.get(0) * 1111;
            
        } else if (map.values().contains(3)) {
            int p = 0;
            int q = 0;
            for (int i : list) {
                if (map.get(i) == 3) {
                    p = i;
                } else {
                    q = i;
                } 
            }
            answer = (10 * p + q) * (10 * p + q);
            
        } else if (map.values().contains(2) && map.size() == 2) {
            int p = list.get(0);
            int q = list.get(1);
            answer = (p + q) * Math.abs(p - q);
            
        } else if (map.values().contains(2) && (map.size() != 2)) {
            int x = 0;
            for (int i : list) {
                if (map.get(i) == 2) {
                    x = i;
                }
            }
            answer = (a*b*c*d)/x/x;
            
        } else {
            int min1 = Math.min(a, b);
            int min2 = Math.min(c, d);
            answer = Math.min(min1, min2);
        }
        return answer;
    }
}