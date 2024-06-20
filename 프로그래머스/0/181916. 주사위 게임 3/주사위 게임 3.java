import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d }; // 굴린 주사위 눈을 배열로 저장
        Arrays.sort(dice); // 오름차순으로 정렬
        int[] myNum = Arrays.stream(dice).distinct().toArray(); // 중복된 눈을 제거한 수를 배열로 저장
        int count = myNum.length; // 중복 제거된 배열의 길이를 저장 

        switch (count) {
            // 모든 주사위 숫자가 다른 경우(중복이 없어서 배열의 길이가 4)
            case 4:
                return dice[0];
            
            // 두가지 수가 나온 경우
            case 2:
                // 세 주사위 숫자가 같고 하나만 다른 경우
                if (dice[1] == dice[2] && dice[0] == dice[1]) {
                    return (10 * dice[1] + dice[3]) * (10 * dice[1] + dice[3]);
                } else if(dice[1] == dice[2] && dice[2] == dice[3]) {
                    return (10 * dice[1] + dice[0]) * (10 * dice[1] + dice[0]);
                }else{  // 두 가지 숫자가 각각 두 번씩 나온 경우
                    return (dice[1] + dice[2]) * Math.abs(dice[1] - dice[2]);
                }

            // 세가지 수가 나온 경우
            case 3:
                if (dice[0] == dice[1]) {
                    return dice[2] * dice[3];
                } else if (dice[1] == dice[2]) {
                    return dice[0] * dice[3];
                } else {
                    return dice[0] * dice[1];
                }

            // 1가지 수만 나온 경우(4개 모두 같은 수)
            case 1:
                return 1111 * dice[0];

        }
        return 0;

            }
}
