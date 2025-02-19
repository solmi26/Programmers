class Solution {
    public String solution(String s) {
        int len = s.length();
        String[] strArr = s.split("");
        
        return len % 2 == 0 ? strArr[len/2 -1 ] + strArr[len/2] : strArr[len/2];
    }
}