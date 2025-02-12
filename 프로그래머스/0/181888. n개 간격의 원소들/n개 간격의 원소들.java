import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {

        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<num_list.length; i+=n){
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(i->i).toArray();

        /** array로 코딩테스트 문제 풀어보기!
        int[] answer = new int[(int) Math.ceil((double)num_list.length/n)];
        int index = 0;
        
        for(int i=0; i<num_list.length; i+=n){
            answer[index] = num_list[i];
            index++;
        }
        
        return answer;
        **/
    }
}
