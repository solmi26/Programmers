class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) return new int[] {-1};
        
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int idx = 0;
        
        for(int num:arr){
            min = Math.min(min, num);
        }
        
        for(int num:arr){
            if(min == num) continue;
            answer[idx++] = num;
        }
        
        return answer;
    }
}