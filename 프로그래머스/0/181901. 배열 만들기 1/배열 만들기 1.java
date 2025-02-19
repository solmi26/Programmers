class Solution {
    public int[] solution(int n, int k) {
        int size = 0;
        int idx = 0;
        
        for(int i=k; i<=n; i++){
            if(i % k == 0) size++;
        }
        
         int[] answer = new int[size];
        
        for(int i=k; i<=n; i++){
            if(i % k == 0) answer[idx++] = i;
        }
        
        return answer;
    }
}