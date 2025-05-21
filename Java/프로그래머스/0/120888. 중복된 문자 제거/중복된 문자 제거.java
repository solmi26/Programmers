class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char str = my_string.charAt(i);
            if(answer.indexOf(str) == -1) answer += str; 
        }
        
        return answer;
    }
}