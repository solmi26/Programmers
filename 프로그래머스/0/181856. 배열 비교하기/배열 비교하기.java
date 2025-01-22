import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length < arr2.length) return -1;
        else{
            if(Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) return 0;
            else return Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : -1; 
        }

        /**
        Integer.compare(x, y) -> x == y라면, 0을 반환.
                                 x < y라면, -1을 반환.
                                 x > y라면, 1을 반환.
        **/
        
    }
}
