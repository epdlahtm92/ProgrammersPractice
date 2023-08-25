import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i : arr) {
            int cnt = 0;
            for (int j : delete_list) {
                if (i == j) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                answer.add(i);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}