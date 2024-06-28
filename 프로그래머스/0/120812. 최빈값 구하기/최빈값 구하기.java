import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        if(array.length == 1) return array[0];
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:array){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int mode = 0;
        int value = 0;
        int maxValue = 0;
        for(Integer key:map.keySet()){
            value = map.get(key); 
            if(maxValue<value){
                mode = key;
                maxValue = value;
            }else if(maxValue==value) {
                mode = -1;}
        }
        return mode;

        
    }
}