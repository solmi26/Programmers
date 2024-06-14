import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
//         String[] tokens = a.split("");
        
//         // for(int i=0; i<tokens.length; i++){
//         //     System.out.println(tokens[i]);
//         // }
        
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
        
        sc.close();
    }
}