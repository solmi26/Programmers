class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int n:num_list){
            answer[n%2]++; // 홀수면 인덱스 1, 짝수면 인덱스 0을 1씩 증가
            
            // if(n%2==0){
            //     answer[0]++;
            // }else{
            //     answer[1]++;
            // }
        }
        return answer;
    }
}
