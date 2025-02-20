class Solution {
    public int[] solution(long n) {
        String str = n + "";
        String[] arr = str.split("");
        int[] answer = new int[arr.length];
        int idx = 0;
        
        for(int i=arr.length-1; i>=0; i--){
           answer[i] = str.charAt(idx++) - '0';
        }
        
        return answer;
    }
}