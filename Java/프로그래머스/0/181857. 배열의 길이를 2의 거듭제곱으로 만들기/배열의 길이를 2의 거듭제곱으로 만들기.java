import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        int n = 1;
        
        
        
        while(n < len){
            n *= 2;
        }
        
        if(len == n) return arr;
        
        return Arrays.copyOf(arr, n);
    }
}