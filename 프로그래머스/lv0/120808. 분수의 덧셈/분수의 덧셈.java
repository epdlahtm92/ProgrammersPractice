class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int n = (numer1 * denom2) + (numer2 * denom1);
        int d = denom1 * denom2;
        
        int r = Euc(n,d);
        int[] answer = {n/r, d/r};
        
        return answer;
    }
    
    public int Euc(int a, int b) {
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            int x = max % min;
        if (x == 0) {
            return min;
        } else {
            return Euc(min, x);
        }
    }
}