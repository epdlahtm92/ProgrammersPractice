import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr.clone();
        List<Integer> cutList = new ArrayList<>();
        for (int i = 0; i < query.length; i++) {
            if ((i % 2) == 0) {
                for(int j = 0; j <= query[i]; j++){
                    cutList.add(answer[j]);
                }
            } else {
                for (int j = query[i]; j < answer.length; j++) {
                    cutList.add(answer[j]);
                }
            }
            answer = cutList.stream().mapToInt(x -> x).toArray();
            cutList.clear();
        }
       
        return answer;
    }

}