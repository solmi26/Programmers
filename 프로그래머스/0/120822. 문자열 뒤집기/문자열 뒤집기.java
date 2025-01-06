class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--){
            answer += my_string.charAt(i);    
        }
        return answer;

        /**
        //StringBuilder reverse를 사용해서 풀이
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        
        return sb.toString();
        **/
    }
}
