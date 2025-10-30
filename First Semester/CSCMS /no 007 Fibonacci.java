import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int inp = xx.nextInt();
        int a = 0;
        int b = 1;
            
        for (int i = 1 ; i <= inp ; i++) {
            System.out.print(a + " ");
            int next = a + b; //variabel itung next element
            a = b; //a geser ke b
            b = next; //b geser ke next
        }
    }
}
