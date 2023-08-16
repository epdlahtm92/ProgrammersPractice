import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> a = new ArrayList<Integer>(map.values());
        Collections.sort(a);
        int mf = a.get(a.size()-1);
        int cnt = 0;
        for(int i : map.keySet()) {
            if (map.get(i) == mf) {
                answer = i;
                cnt++;
            }
            if (cnt > 1) {
                return -1;
            }
        }
        return answer;
    }
}