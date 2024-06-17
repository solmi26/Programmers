class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int answer = Math.max(Integer.parseInt(ab), 2*a*b);
        return answer;
    }
}