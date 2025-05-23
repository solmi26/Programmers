class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int len = myString.length();
        
        for(int i=0; i<len; i++){
            String str = myString.substring(0,len-i);
            if(str.endsWith(pat)) return str;
        }
        
        return answer;
    }
}