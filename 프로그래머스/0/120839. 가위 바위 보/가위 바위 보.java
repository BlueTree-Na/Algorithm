import java.util.*;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] result = rsp.split("");
        HashMap<String, String> str = new HashMap<>();
        str.put("2", "0");
        str.put("0", "5");
        str.put("5", "2");

        for (String i : result) {
            answer += str.get(i);
        }
        return answer;
    }
}