import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int n = xx.nextInt();
        int[] A = new int[n];
        int sum = 0; 

        for (int i = 0 ; i < n ; i++) {
            A[i] = xx.nextInt();            
        }

        int q = xx.nextInt(); //jumlah q sum
        for (int i = 0 ; i < q ; i++) {
            int a = xx.nextInt();
            int b = xx.nextInt();
            for (int j = a ; j <= b ; j++) {
                sum += A[j];
            }
            System.out.println(sum); //must outside loop biar input 2 kali dulu baru print wkwk
            sum = 0; //balikin sum ke 0 setelah q pertama
        }  
    }
}
