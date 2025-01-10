class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for(int i=1; i*i<=n; i++){
            if(i*i == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    
        /**
        for(int i=1; i*i<=n; i++){ // i*i번째까지만 확인하면 
            if(i*i == n) {
                answer = 1;
                break; // break 문 넣어서 제곱근 찾으면 멈추기
            }
        }
        return answer;
        **/

        /**
         if (n % Math.sqrt(n) == 0) { // 내장 함수 이용하기
            return 1;
        } else {
            return 2;
        }
        **/
    }
}
