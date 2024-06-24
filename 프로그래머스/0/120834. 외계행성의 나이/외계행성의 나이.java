class Solution {
    public String solution(int age) {
        String answer = "";
        int num = 0;
        char ch;

        while (age > 0) {
            num = (age % 10) + 97;
            age /= 10;
            ch = (char) num;
            answer = ch + answer;
        }

        return answer;
    }
}