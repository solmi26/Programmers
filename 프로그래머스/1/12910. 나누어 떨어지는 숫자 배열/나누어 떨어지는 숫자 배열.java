import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        int idx = 0;
        
        for(int n:arr){
            if(n % divisor == 0 ) size++;
        }
        
        if(size == 0) return new int[] {-1};
        
        int[] newArr = new int[size];
        
        for(int n:arr){
            if(n % divisor == 0 ) newArr[idx++] = n;
        }
        
        Arrays.sort(newArr);
        
        return newArr;
    }
}