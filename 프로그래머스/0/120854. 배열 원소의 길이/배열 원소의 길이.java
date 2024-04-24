import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int cnt = 0;

        for (String i : strlist) {
            answer[cnt++] = i.length();
        }

        return answer;
    }
}