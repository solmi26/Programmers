import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num:arr){
            for(int i=0; i<num; i++) answer.add(num);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
    
}