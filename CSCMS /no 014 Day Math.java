import java.util.Scanner;
public class Yoyo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int inp = s.nextInt();
        int d = inp/1440;
        int y = d/365;
        int dy = d % 365;
        
        System.out.print(y +" " + dy);
        
    }
}
