class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(true){
            if(n % answer == 1) return answer;
            else answer++;
        }
    }
}