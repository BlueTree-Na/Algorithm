class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (angle % 90 == 0){
            answer = angle / 90 * 2;
        } else {
            return answer = angle < 90 ? 1 : 3;
        }
        
        
        return answer;
    }
}