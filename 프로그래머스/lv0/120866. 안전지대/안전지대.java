import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0 ; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if(i > 0){
                        if (j > 0) {
                            set.add(Integer.toString(i-1) + "," + Integer.toString(j-1));
                        }
                        set.add(Integer.toString(i-1) + "," + Integer.toString(j));
                        if (j < board.length-1) {
                             set.add(Integer.toString(i-1) + "," + Integer.toString(j+1));
                        }
                    }
                    
                    if (j > 0) {
                        set.add(Integer.toString(i) + "," + Integer.toString(j-1));
                    }
                    set.add(Integer.toString(i) + "," + Integer.toString(j));
                    if (j < board.length-1) {
                         set.add(Integer.toString(i) + "," + Integer.toString(j+1));
                    }
                    
                    if(i < board.length-1){
                        if (j > 0) {
                            set.add(Integer.toString(i+1) + "," + Integer.toString(j-1));
                        }
                        set.add(Integer.toString(i+1) + "," + Integer.toString(j));
                        if (j < board.length-1) {
                             set.add(Integer.toString(i+1) + "," + Integer.toString(j+1));
                        }
                    }
                    
                }
            }
        }
        answer = board.length * board.length - set.size();
        return answer;
    }
}