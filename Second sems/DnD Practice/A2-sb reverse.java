import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int jum = s.nextInt();
        s.nextLine();
        String[] words = new String[jum];
        
        for (int i = 0 ; i < jum ; i++) {
            words[i] = s.nextLine();
            words[i] = new StringBuilder(words[i]).reverse().toString();
            
            if (i % 2 == 0) {
                words[i] = words[i].toUpperCase();
            } else {
                words[i] = words[i].toLowerCase();
            }
        }
        
        for (int i = 0 ; i < jum ; i++) {
            System.out.println(words[i]);
        }
    }
}
