using System;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.Length; i++) {
            while(babbling[i].Length >= 2) {
                String bab2 = babbling[i].Substring(0,2);
                String bab3 = "";
                if (babbling[i].Length >= 3){
                    bab3 = babbling[i].Substring(0,3);
                }
                if (bab2.Equals("ye") || bab2.Equals("ma")) {
                    babbling[i] = babbling[i].Substring(2);
                } else if (bab3.Equals("aya") || bab3.Equals("woo")) {
                    babbling[i] = babbling[i].Substring(3);
                } else {
                    break;
                }
            }
            if (babbling[i].Length == 0){
                answer++;
            }
        }
        return answer;
    }
}