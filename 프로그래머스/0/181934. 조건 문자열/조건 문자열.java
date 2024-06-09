class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = Math.max(n, m); //실제 큰 수
        //입력값의 등호가 크다고 가르키는 수를 담기 위한 변수
        //기본적으로 m으로 할당
        int input_big = m; 
        
     //입력값의 등호가 크다고 가르키는 수를 input_big 변수에 담음
     if (ineq.equals(">")) {
            input_big = n;
            if (eq.equals("=")) {
                input_big = n;
            }
        }
        
        //실제 큰 수와 입력값의 등호가 크다고 가르키는 수를 비교
        //실제 큰 수와 같으면 1, 틀리면 0
        if (answer == input_big) {
            return 1;
        }
        return 0;
    }
}