class Solution {
    public int solution(int n) {
        int countA = Integer.bitCount(n);
        
        while(true){
            n++;
            if(countA  == Integer.bitCount(n)) return n;
        }
        
    }
}