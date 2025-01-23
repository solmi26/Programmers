class Solution {
    public int solution(String myString, String pat) {
        
        String[] arr =  myString.split("");
        String newString = "";
        
        for(String str:arr){
            if(str.equals("A")) newString += "B";
            else newString += "A";
        }
        
        if(newString.contains(pat)) return 1;
        else return 0;


        /**
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
        **/
    }
}
