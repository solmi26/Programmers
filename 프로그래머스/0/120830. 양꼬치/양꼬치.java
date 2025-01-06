class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int discount = n / 10;
        
        if(discount >= 1) k -= discount;
        
        answer = (n*12000) + (k*2000);
        
        return answer;
    }
}