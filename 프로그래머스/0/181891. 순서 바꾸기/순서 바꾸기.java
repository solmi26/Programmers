class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length];
        
        for(int i=n; i<num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        
        for(int i=0; i<n; i++){
            answer[idx++] = num_list[i];
        }
        return answer;


        /** 
        // 반복문을 한번만 쓰려고 했는데 유지보수 및 효율상 위에 코드가 더 낫다고 판단하여 수정함.
         for(int i=0; i<len; i++){
            if(n == len) n = 0;
            answer[i] = num_list[n];
            n++;   
        }
        **/
    }
}
