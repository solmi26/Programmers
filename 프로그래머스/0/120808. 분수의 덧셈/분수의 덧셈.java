class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        
        int gcd = gcd(numer, denom);
        
        numer /= gcd;
        denom /= gcd;
        
        int[] answer = {numer, denom};
        
        return answer;
    }
    
    // 최대공약수 구하기
    int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}