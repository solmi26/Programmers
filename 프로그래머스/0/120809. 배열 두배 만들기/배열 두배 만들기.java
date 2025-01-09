class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        int count = 0;
        for(int num:numbers){
            answer[count] = num*2;
            count++;
        }
        
        return answer;
    }
}