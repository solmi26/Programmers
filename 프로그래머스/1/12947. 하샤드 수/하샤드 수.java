class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = x + "";
        int sum = 0;
        
        for(int i=0; i<str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        
        if(x % sum == 0) answer = true;
        
        return answer;
    }
}