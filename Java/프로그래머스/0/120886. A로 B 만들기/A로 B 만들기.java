import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        
        String[] b_arr = before.split("");
        String[] a_arr = after.split("");
        
        Arrays.sort(b_arr);
        Arrays.sort(a_arr);
        
        for(int i=0; i<before.length(); i++){
            if(!b_arr[i].equals(a_arr[i])) {
                return 0;
            }
        }
        
        
        return 1;
    }
}