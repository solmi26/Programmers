class Solution {
    public int solution(int num) {
        int answer = 0;
        long tempNum = num;
        
        if(tempNum == 1) return 0;
        
        while(tempNum != 1){
            if(answer >= 500) return -1;
            
            if(tempNum % 2 == 0) {
                tempNum /= 2;
            }
            else {
                tempNum *= 3;
                tempNum += 1;
            }
            
            answer++;
        }
        
        return answer;
    }
}