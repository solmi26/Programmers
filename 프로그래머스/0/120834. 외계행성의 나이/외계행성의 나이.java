class Solution {
    public String solution(int age) {
        String sAge = age + "";
        String answer = "";
        for(int i=0; i<sAge.length(); i++){
            char a = (char) (sAge.charAt(i) - '0' + 'a');
            answer += a;
        }
        return answer;
    }
}