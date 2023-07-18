import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> tmp = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            tmp.put(name[i], yearning[i]);    
        }
        for(int i = 0 ; i < photo.length; i++){
            for(String str : photo[i]) {
                answer[i] += tmp.getOrDefault(str, 0);
            }
        }
        return answer;
    }
}