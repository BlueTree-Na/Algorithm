import java.util.*;
class Solution {
    public long solution(int balls, int share) {
        int cnt = share - 1;
        long answer = 1;
        
        
        while(cnt >= 0){
            answer = answer * (balls - cnt) / (share - cnt);
            cnt--;
        }
        
        return answer;
    }
}