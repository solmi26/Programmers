import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] countArr = new int[31];
        
        for(String str:strArr){
            countArr[str.length()]++;
        }
        
        Arrays.sort(countArr);
        
        return countArr[30];
    }
}