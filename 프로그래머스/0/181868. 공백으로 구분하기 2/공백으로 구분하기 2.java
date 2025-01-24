import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        
        return Arrays.stream(answer).filter(value -> !value.equals("")).toArray(String[]::new);
    }
}