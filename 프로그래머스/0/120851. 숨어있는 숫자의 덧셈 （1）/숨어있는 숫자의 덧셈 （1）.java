import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[A-z]", "0");
        String[] reStr = my_string.split("");
        
        int[] num = new int[reStr.length];
        
        for(int i = 0; i < reStr.length; i++){
            num[i] = Integer.parseInt(reStr[i]);
            if(num[i] < 10){
                answer += num[i];
            }
        }
        
        return answer;
    }
}