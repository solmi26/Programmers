class Solution {
    boolean solution(String s) {
        String str = s.toUpperCase();
        int p = 0;
        int y = 0;
        
        for(int i=0; i<s.length(); i++){
            if(str.charAt(i) == 'P') p++;
            else if(str.charAt(i) == 'Y') y++;
        }

        return p == y;
    }
}