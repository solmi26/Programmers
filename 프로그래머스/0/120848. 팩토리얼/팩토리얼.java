class Solution {
    public int solution(int n) {
        int count = 1;
        int fn = 1;
        
        while(fn <= n){
            count++;
            fn *= count;
        }
        
        return count-1;
    }
}