class Solution {
    public String solution(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
        
        // String answer = "";
        // for(int i=0; i<arr.length;i++){
        //     answer += arr[i];
        // }
        // return answer;
    }
}