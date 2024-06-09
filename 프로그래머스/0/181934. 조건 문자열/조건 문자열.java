class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = Math.max(n, m);
        int big = m;

     if (ineq.equals(">")) {
            big = n;
            if (eq.equals("=")) {
                big = n;
            }
        }

        if (answer == big) {
            return 1;
        }
        return 0;
    }
}