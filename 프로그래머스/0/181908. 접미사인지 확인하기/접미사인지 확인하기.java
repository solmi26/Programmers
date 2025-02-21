class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int idx = my_string.length() - 1;
        if(my_string.length() < is_suffix.length()) return 0;
        
        for(int i=is_suffix.length()-1; i>=0; i--){
            if(my_string.charAt(idx--) != is_suffix.charAt(i)) break;
            else answer = 1;
        }
        
        return answer;
    }
}