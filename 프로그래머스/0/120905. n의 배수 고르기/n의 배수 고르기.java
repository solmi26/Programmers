import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num:numlist){
            if(num%n == 0) arr.add(num);
        }
        
        return arr.stream().mapToInt(i->i).toArray();

        /**
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
        **/
    }
}
