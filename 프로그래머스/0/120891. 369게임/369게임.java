class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = order+"";
        
        for(int i=0; i<str.length(); i++){
            int ch = str.charAt(i) - '0';  
            if(ch == 0) continue;
            if(ch % 3 == 0) answer++;

        }
        
        return answer;
    }
}