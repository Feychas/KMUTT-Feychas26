import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	Scanner xx = new Scanner(System.in);
    
     int inp = xx.nextInt();
    
     for (int i = 1 ; i <= inp ; i++) { //outter for row ke bawah 
     	 for (int j = 1 ; j <= inp ; j++) { //innner for coloumn, how many kesamping
          System.out.print("*");
     } System.out.println(); }
  }
}
