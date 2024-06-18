class Solution {
    public int solution(int number, int n, int m) {
        boolean result = (number % n == 0) && (number % m == 0);
        return result ? 1 :0;
    }
}