class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int idx = 0;
        
        for(int n:arr){
            if(k % 2 == 0) answer[idx++] = n + k;
            else answer[idx++] = n * k;
        }
        
        return answer;
    }
}