class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num_len = num_list.length / n;
        int[][] answer = new int[num_len][n];
        int cnt = 0;
        
        for (int i = 0; i< num_len; i++){
            for (int j = 0; j< n; j++){
                answer[i][j] = num_list[cnt++];
            }
        }
        
        
        return answer;
    }
}