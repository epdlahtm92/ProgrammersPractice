import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
       List<Integer> answer = new ArrayList<Integer>();
        for(int i = num1; i <= num2; i++){
            answer.add(numbers[i]);
        }
        int[] res = answer.stream().mapToInt(x -> x).toArray();
        return res;
    }
}