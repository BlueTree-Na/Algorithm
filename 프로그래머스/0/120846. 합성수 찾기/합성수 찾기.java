class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        while(n != 0){
            for(int i = 1; i <= n; i++){
                if (n % i == 0){
                    cnt++;
                }
            }
            if (cnt >= 3){
                answer++;
            }
            cnt = 0;
            n--;
        }
        
        return answer;
    }
}