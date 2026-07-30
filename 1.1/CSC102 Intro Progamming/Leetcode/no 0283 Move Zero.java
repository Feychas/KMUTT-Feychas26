import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    int[] nums = new int[5]; //use max 5 as example karena ga d mention di question

    //input
    int n = 0;
    while (n < 5) {
      nums[n] = x.nextInt();
      n++;
    }
    
    int s = 0; //index where we will copy non-zero numbers
    int f = 0; //current index we check
    while (f < nums.length) {
        if (nums[f] != 0) { //kalau index not 0
            nums[s] = nums[f];
            s++;
            }
            f++; //check next index
        }
        //but this loop make last number still as it is, so we do
        while (s < nums.length) {
            nums[s] = 0;
            s++;
        }
        
        for (int i = 0 ; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
}
}
