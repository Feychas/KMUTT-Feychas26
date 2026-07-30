import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
  	Scanner x = new Scanner(System.in);
    int n = x.nextInt();
	int[] nums = new int[n];
    for (int i = 0 ; i < n ; i++) {
      nums[i] = x.nextInt();
    }
    ArrayList<Integer> ress = new ArrayList<>();
    int count = 0;
    for (int i = 0 ; i < n ; i++) {
      int left = (i == 0) ? 0 : nums[i-1];
      int right = (i == n-1) ? 0 : nums[i+1];
      
      if (nums[i] >= left && nums[i] >= right) {
          count++;
          ress.add(nums[i]);
      }
    }
    
    System.out.println(count);
    for (int totot : ress) {
    System.out.print(totot + " "); }
    
  }
}
