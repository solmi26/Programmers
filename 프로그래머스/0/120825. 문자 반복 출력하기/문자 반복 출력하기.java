class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }

        /*
        String[] str = my_string.split(""); // 배열로 반환
        
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        */
        
        return answer;
    }
}
