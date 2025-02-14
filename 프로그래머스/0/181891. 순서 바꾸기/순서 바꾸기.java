class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            if(n == len) n = 0;
            answer[i] = num_list[n];
            n++;   
        }
        
        return answer;
    }
}