import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] chArr = answer.toCharArray();
        
        Arrays.sort(chArr);
        
        return new String(chArr);
    }
}