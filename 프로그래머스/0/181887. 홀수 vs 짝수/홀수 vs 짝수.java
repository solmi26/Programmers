class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        
        int count = 0;
        for(int num:num_list){
            if(count % 2 == 0) even += num;
            else odd += num;
            count++;
        }
        return Math.max(odd,even);
    }
}