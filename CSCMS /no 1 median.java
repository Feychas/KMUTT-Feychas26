import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int a = xx.nextInt();
        int b = xx.nextInt();
        int c = xx.nextInt();
        
        int res = a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
        System.out.print(res);
        
    }
}
