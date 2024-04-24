import static java.util.Arrays.sort;
class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int sum = 0;
        int num = 0;
        
        sort(sides);
        
        sum = sides[0] + sides[1];
        num = sides[2];
        
        if (num < sum) {
            answer = 1;
        }
        
        return answer;
    }
}