import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] A = {1,2,3,4,5};
        int[] B = {2,1,2,3,2,4,2,5};
        int[] C = {3,3,1,1,2,2,4,4,5,5};
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
               
        for(int i = 0; i < answers.length; i++){
            if (answers[i] == A[i%A.length]){
                countA++;
            }
            if (answers[i] == B[i%B.length]){
                countB++;
            }
            if (answers[i] == C[i%C.length]){
                countC++;
            }
        }
        
        int max = Math.max(Math.max(countA,countB),countC);
        ArrayList<Integer> re = new ArrayList();
        
        if(countA == max){
            re.add(1);
        }
        
        if(countB == max){
            re.add(2);
        }
        
        if(countC == max){
            re.add(3);
        }
        
        int[] answer = re.stream()
            .mapToInt(Integer::intValue)
    	    .toArray();
        
        
        return answer;
    }
}