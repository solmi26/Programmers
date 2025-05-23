import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        
        if(answer.length == 0) return new String[] {"EMPTY"};
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String str:answer){
            if(!str.equals("")) list.add(str);
        }
        
        return list.toArray(new String[0]);
        
    }
}