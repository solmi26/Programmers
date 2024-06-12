// 디버깅 문제
// 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
// 1줄만 수정하여 버그를 고치세요.
// 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
         // if (our_score[i] == score_list[i]) { // 기존코드
            if (our_score[i] == score_list[numbers[i]-1]) { // 수정코드
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
