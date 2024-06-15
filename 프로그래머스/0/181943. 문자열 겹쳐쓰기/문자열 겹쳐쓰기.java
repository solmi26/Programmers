class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 첫번째로 생각한 방식
        /*String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(overwrite_string.length()+s);
        return answer;*/

        // 두번째로 생각한 방식
        StringBuffer sb = new StringBuffer(my_string);
        sb.replace(s,s+overwrite_string.length(),overwrite_string);
        return sb.toString();
    }
}
