class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuffer sb = new StringBuffer(my_string);
        sb.replace(s,s+overwrite_string.length(),overwrite_string);
        return sb.toString();
    }
}