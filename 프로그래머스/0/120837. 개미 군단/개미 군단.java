class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while(hp > 0){
            if(hp >= 5) {
                answer += hp / 5;
                hp %= 5;
            }else if(hp >= 3){
                answer += hp / 3;
                hp %= 3;
            }else{
                answer += hp;
                hp -= hp;
            }
        }

        /**
        hp가 5 미만이어도 hp / 5의 결과는 0이고, hp % 5의 결과는 그대로 hp이기 때문에, 굳이 while문으로 조건을 확인할 필요가 없다.
        
            answer += hp / 5; // 장군개미
            hp %= 5;
    
            answer += hp / 3; // 병정개미
            hp %= 3;
    
            answer += hp; // 일개미
            
            return answer;
            **/
            
            return answer;
    }
}
