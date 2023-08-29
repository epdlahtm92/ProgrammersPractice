import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> arrList = new ArrayList<>();
        for(int i : arr) {
            arrList.add(i);
        }
        int start = 0;
        int end = 0;
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for (int i = arr.length-1 ; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        if (!arrList.contains(2)){
            answer.add(-1);
        } else {
            answer.clear();
             for (int i = start; i <= end; i++){
            answer.add(arr[i]);
        }
        }
       
        return answer.stream().mapToInt(x -> x).toArray();
    }
}