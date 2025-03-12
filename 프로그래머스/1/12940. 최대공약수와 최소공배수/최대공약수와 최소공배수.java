class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1, 1};
        int min = Math.min(n,m);
        int n2 = n;
        int m2 = m;
        
        for(int i=1; i<=min; i++){
            if(n%i == 0 && m%i == 0) {
                answer[0] = i;
            } 
            
            }
        
        answer[1] = (n*m) / answer[0]; 
        
        return answer;
    }
}