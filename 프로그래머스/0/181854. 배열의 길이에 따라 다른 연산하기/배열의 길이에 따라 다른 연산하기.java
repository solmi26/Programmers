class Solution {
    public int[] solution(int[] arr, int n) {
        
        int[] answer = new int[arr.length];
        
        int check = arr.length % 2;
        
        for(int i=0; i<arr.length; i++){
            if(check == 0){
                if(i%2==0) answer[i] = arr[i];
                else answer[i] = arr[i] + n;
            }else{
                if(i%2==1) answer[i] = arr[i];
                else answer[i] = arr[i] + n;
            }
        }
        
        return answer;
    }
}