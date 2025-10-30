import java.util.Scanner;
public class Ray{
    public static void main(String[] args) {
        Scanner hh = new Scanner(System.in);
        
        int jum = hh.nextInt();;
        int[] inp = new int[jum];
        
        for (int i = 0 ; i < jum ; i++) { //input array
            inp[i] = hh.nextInt();
        }
        
        for (int j = jum-1 ; j >= 0 ; j--) { //reverse
            System.out.print(inp[j] + " ");
        }
    }
}
