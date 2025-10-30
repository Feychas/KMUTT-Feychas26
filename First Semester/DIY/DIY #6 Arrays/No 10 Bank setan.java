import java.util.Scanner;
public class Anjir {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        String start = x.nextLine();
        String end = x.nextLine();
        int n = x.nextInt();
        String[] bank = new String[n];
        
        for (int i = 0 ; i < n ; i++) {
            bank[i] = x.nextLine();
        }
        
        int c = 0;
        //if check from back
        /*for (int i = start.length() - 1 ; i >= 0 ; i--) {
            if (start.charAt(i) != end.charAt(i)) {
                c++;
            }
        }*/
        
        //if check from start
        for (int i = 0 ; i < start.length() ; i++) {
            if (start.charAt(i) != end.charAt(i)) {
                c++;
            }
        }
            
        if (c > n) { //Aturan soal: setiap langkah harus menghasilkan string yang ADA di bank, dan end juga harus ada di bank soo
            System.out.print(-1);
        } else {
            System.out.print(c);
            }
        
    }
}
