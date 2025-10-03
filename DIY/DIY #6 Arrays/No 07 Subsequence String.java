import java.util.Scanner;
public class Xoxo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        String s = x.nextLine();
        String t = x.nextLine();
        
        char[] ars = s.toCharArray(); //method change string to char in array
        char[] art = t.toCharArray(); 
        
        int i = 0; //as pointer buat chr s
        for (int j = 0 ; j < t.length() && i < s.length() ; j++) {
            if (ars[i] == art[j]) {
                i++;
            }
        }
        
        if (i == s.length()) {
            System.out.print("true");
        }  else {
            System.out.print("false");
        }
        
    }
}
