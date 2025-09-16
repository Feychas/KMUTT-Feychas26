import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int row = xx.nextInt();
        int col = xx.nextInt();
        
        for (int i = 1 ; i <= row ; i++) { //row as always
            if (i == 1 || i == row) { //buat star awal akhir row
                for (int j = 1 ; j <= col ; j++) { //print the stsar col
                    System.out.print("*");
                }
            } else {
                System.out.print("*"); //cetak left first *
                for (int j = 2 ; j < col ; j++) { //print _ karena start from 2 dr ats / bwh
                    System.out.print("-");
                } System.out.print("*"); //buat print the right last *
            } System.out.println();
        }
        
    }
}
