import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> answer = new ArrayList<>();
        for(String str : strlist) {
            answer.add(str.length());
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}