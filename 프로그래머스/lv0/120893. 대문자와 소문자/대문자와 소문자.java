class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char c : my_string.toCharArray()) {
            if ((int) c < 97) {
                char tmp = (char)((int) c + 32);
                answer += tmp;
            } else {
                char tmp = (char)((int) c - 32);
                answer += tmp;
            }
        }
        return answer;
    }
}