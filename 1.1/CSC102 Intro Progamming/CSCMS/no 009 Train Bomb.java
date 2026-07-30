import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int cart = xx.nextInt();
        int bomb = xx.nextInt();
        
        if (cart <= 3) {
            System.out.print("DIE"); //die khusus under 3 kan
            //return;
        }
        
        for (int i = 1 ; i <= cart ; i++) { //buat cek all number
            if (i < bomb - 1 || i > bomb + 1) { //exclude die bomb
                System.out.print(i + " ");
            }
        }
    }
}
