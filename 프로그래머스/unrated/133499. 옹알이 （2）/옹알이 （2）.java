class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < impossible.length; j++) {
                if (babbling[i].contains(impossible[j])) {
                    babbling[i] = " ";
                }
            }
        }
        
        for (int i = 0; i < babbling.length; i++) {
            while(babbling[i].length() >= 2) {
                String bab2 = babbling[i].substring(0,2);
                String bab3 = "";
                if (babbling[i].length() >= 3){
                    bab3 = babbling[i].substring(0,3);
                }
                if (bab2.equals("ye") || bab2.equals("ma")) {
                    babbling[i] = babbling[i].substring(2);
                } else if (bab3.equals("aya") || bab3.equals("woo")) {
                    babbling[i] = babbling[i].substring(3);
                } else {
                    break;
                }
            }
            if (babbling[i].length() == 0){
                answer++;
            }
        }
        return answer;
    }
}