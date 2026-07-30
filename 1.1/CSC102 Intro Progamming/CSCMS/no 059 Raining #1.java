import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);

        int n = xx.nextInt(); //bucket
        int d = xx.nextInt(); //days
        int[] buc = new int[n];

        for (int i = 1 ; i <= d ; i++) { //input which bucket per day
            int a = xx.nextInt();
            int b = xx.nextInt();
            for (int j = a-1 ; j < b ; j++) {
                buc[j]++; //add water drop to bucket
            }
        }
        for (int i = 0 ; i < n ; i++) { //printing harus terpisah biar nyelesain input dulu
            System.out.print(buc[i] + " ");
        }
    }
}
