class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i=4; i<=n; i++){
            for(int j=2; j<i; j++){
                if(count >= 1){
                    answer++;
                    count = 0;
                    break;
            }
            
                if(i % j == 0) count++;
            }

        }
        
        return answer;
    }
}