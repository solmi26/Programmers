class Solution {
    public String solution(String phone_number) {
        String star = "*";
        int len = phone_number.length() - 4;
        return star.repeat(len) + phone_number.substring(len);
    }
}