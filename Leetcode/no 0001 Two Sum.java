import java.util.Scanner;
public class Tusum {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    int target = x.nextInt();
    int[] nums = new int[5]; //use max 5 as example karena ga d mention di question

    //input array
    int n = 0;
    while (n < 5) {
      nums[n] = x.nextInt();
      n++;
    }
    
    out: //apparently ini bisa buat break the entire loop dengan penempatan inner loop
    for (int i = 0 ; i < nums.length ; i++) {
            for (int j = 0 ; j < nums.length ; j++) {
                if ((nums[i] + nums[j] == target) && i != j) {
                    System.out.print("[" + i + "," + j + "]");
                    break out; //tinggal tambahin variabel
                } 
              } 
            }
    }
  }
