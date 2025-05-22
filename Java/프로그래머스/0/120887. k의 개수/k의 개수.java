class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int start=i; start<=j; start++){
            String si = start+"";
            for(int idx=0; idx<si.length(); idx++){
                if(si.charAt(idx) == k+'0') answer++;
            }
        }
        
        return answer;
    }
}