class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if('A' <= ch && ch<='Z'){
                answer+= Character.toLowerCase(ch);
            }else{
                answer += Character.toUpperCase(ch);
            }
        }
        return answer;
    }
}