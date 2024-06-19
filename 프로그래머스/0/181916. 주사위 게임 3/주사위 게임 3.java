import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d };
        Arrays.sort(dice);
        int[] myNum = Arrays.stream(dice).distinct().toArray();
        int count = myNum.length;

        switch (count) {
            case 4:
                return dice[0];

            case 2:
                if (dice[1] == dice[2] && dice[0] == dice[1]) {
                    return (10 * dice[1] + dice[3]) * (10 * dice[1] + dice[3]);
                } else if(dice[1] == dice[2] && dice[2] == dice[3]) {
                    return (10 * dice[1] + dice[0]) * (10 * dice[1] + dice[0]);
                }else{
                    return (dice[1] + dice[2]) * Math.abs(dice[1] - dice[2]);
                }

            case 3:
                if (dice[0] == dice[1]) {
                    return dice[2] * dice[3];
                } else if (dice[1] == dice[2]) {
                    return dice[0] * dice[3];
                } else {
                    return dice[0] * dice[1];
                }

            case 1:
                return 1111 * dice[0];

        }
        return 0;

            }
}