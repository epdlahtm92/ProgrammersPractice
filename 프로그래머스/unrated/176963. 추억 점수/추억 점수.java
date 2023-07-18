import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> tmp = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            if (i <= yearning.length){
                tmp.put(name[i], yearning[i]);    
            } else {
                tmp.put(name[i], 0);
            }
        }

        for(int i = 0 ; i < photo.length; i++){
            for(String str : photo[i]) {
                answer[i] += tmp.getOrDefault(str, 0);
            }
        }
        
        
        return answer;
    }
}