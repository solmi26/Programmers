class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int count = 0;
        for(String str:strlist){
            answer[count] = str.length();
            count++;
        }
        
        return answer;
    }
}