class Solution {
    public String solution(int age) {
        String answer = "";
        for (char c : Integer.toString(age).toCharArray()) {
            char a = (char)((int)c + 97 - 48);
            answer += a;
        }
        return answer;
    }
}