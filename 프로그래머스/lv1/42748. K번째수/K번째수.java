import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for (int[] com : commands) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = com[0]-1; i < com[1]; i++) {
                tmp.add(array[i]);
                Collections.sort(tmp);
                
            }
            answer.add(tmp.get(com[2]-1));
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}