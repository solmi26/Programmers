import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int a:arr){
            list.add(a);
        }
        
        for (int d : delete_list) {
            while (list.contains(d)) {
                list.remove(Integer.valueOf(d));
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}