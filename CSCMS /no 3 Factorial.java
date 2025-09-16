import java.util.Scanner;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    
    int inp = sc.nextInt();
    long res = 1;
    
    if (1 <= inp && inp <= 20) {
        for (int i = 1 ; i <= inp ; i++) {
        res *= i;
        }  
    } 
    System.out.print(res);
  }
}
