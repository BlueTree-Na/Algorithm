class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int ggo = 12000;
        int drink = 2000;
        
        answer = (ggo * n) + (drink * k);
        if (n / 10 >= 1) {
            answer -= (n / 10) * 2000;
        }
        
        return answer;
    }
}