class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();
        
        if(len == 4 || len == 6){
            for(int i=0; i<len; i++){
                if('0' <= s.charAt(i) && s.charAt(i) <= '9') answer = true;
                else{
                  answer = false;
                  break;
                } 
            }    
        }
        
        return answer;
        
    }
}