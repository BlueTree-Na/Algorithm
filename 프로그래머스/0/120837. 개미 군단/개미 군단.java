
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int result = 0;

        for (int i = 5; i > 0; i -= 2) {
            result = hp / i;
            answer += result;
            hp %= i;
        }
        return answer;
    }
}