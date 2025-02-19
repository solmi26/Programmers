class Solution {
    public int solution(int[] num_list) {
        int plus = 1;
        int sum = 0;
        
        for(int num:num_list){
            plus *= num;
            sum += num;
        }
        
        if(plus < sum*sum) return 1;
        else return 0;
        
    }
}