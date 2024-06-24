import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] spd = new Integer[emergency.length];
        int index = 0;

        for (int i : emergency) {
            spd[index++] = i;
        }
        Arrays.sort(spd, Collections.reverseOrder());
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == spd[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}