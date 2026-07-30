import java.util.Scanner;
public class Yaya {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int[] num = new int[101];
        int n = xx.nextInt();
        
        while (n != 0) {
            num[n]++;
            n = xx.nextInt();
        }
        
        for (int i = 0 ; i < num.length ; i++) {
            if (num[i] > 0) {
                System.out.println(i + " occurs " + num[i] +(num[i] > 1 ? " times" : " time"));
            }
        }
        
        
    }
}
