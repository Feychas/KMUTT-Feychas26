import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	Scanner xx = new Scanner(System.in);
    
    int inp = xx.nextInt();
    boolean isPrime = true; //pakai boolean karena yes or no 
    
    if (inp == 1) { //pengecualian 1 itu ga prime soalnya
      System.out.print("No");
      return; //return biar stop di situ aja kalau condition fulfill
    } 

    //prime itu kan yg habis dibagi diri sendiri n 1 aja tp ,msh bs dibagi sama other number
    for (int i = 2 ; i * i <= inp ; i++) { //buat variabel semua num before input for check
      if (inp % i == 0) { //kalau bisa dibagi berarti not prime
        isPrime = false;
        break; //biar stop kalau udah nemu 1 jawaban yg false
      }
    }
    if (isPrime) {
      System.out.print("Yes"); 
    } else {
      System.out.print("No");
    }
  }
}
