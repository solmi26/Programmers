import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        int size = 0;
        int idx = 0;
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if('0' <= ch && ch <='9') size++;
        }
        
        int[] arr = new int[size];
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if('0' <= ch && ch <='9') arr[idx++] = ch - '0';
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
}