import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int inp = xx.nextInt();
        
        for (int i = 1 ; i <= inp ; i++) {
            for (int j = 1 ; j <= inp ; j++) { //buat kaya block biasa
                if ( (i == 1 || i == inp) && (j == 1 || j == inp) ) { //kondisi akhir awal -
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            } System.out.println();
        }
    }
}
