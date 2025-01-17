class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n);
        
        for(int i=0; i<str.length(); i++){
            answer += str.charAt(i) - '0';
        }

        /**
        while(n>0){
            answer += n%10;
            n /= 10;
        }
        **/
        
        
        return answer;
    }
}
