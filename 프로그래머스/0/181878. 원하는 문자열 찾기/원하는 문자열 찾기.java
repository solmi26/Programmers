class Solution {
    public int solution(String myString, String pat) {        
        
        if(myString.toUpperCase().contains(pat.toUpperCase())) return 1;
        else return 0;
        
    }
}