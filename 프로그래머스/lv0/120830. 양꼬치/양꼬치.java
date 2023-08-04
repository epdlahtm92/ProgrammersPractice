class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int tmp = n / 10;
        answer = n * 12000 + (k-tmp) * 2000;
        return answer;
    }
}