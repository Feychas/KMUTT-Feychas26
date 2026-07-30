import java.util.Scanner;
public class Yo { 
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int tot = xx.nextInt();
        int[] num = new int[tot];
        double sum = 0;
        int count = 0;
        
        for (int i = 0 ; i < tot ; i++) { //input
            num[i] = xx.nextInt();
        } 
      
        // another way to input array
        // int i = 0;
        // while (i < tot) {
        //     num[i] = xx.nextInt();
        //     i++; }
        
        for (int i = 0 ; i < tot ; i++) { //sum all array
            sum += num[i]; }
        double avg = sum/tot; //count average
        for (int i = 0 ; i < tot ; i++) { //intinya ini for loop buat cek array satu" bisa diganti while loop
            if (num[i] > avg) {
                count++;
            }
        }
        System.out.println("AVG: " + avg);
        System.out.print("No. above the AVG: " + count);
    }
}
