import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            // if(Character.isLowerCase(ch))
            if (ch >= 97) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }

        }
        System.out.println(result.toString());
        
        sc.close();
    }
}