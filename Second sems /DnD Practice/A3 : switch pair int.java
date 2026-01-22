import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] nums = new int[n];

		for (int i = 0 ; i < n ; i++) {
		    nums[i] = s.nextInt();
		}
		
		if (n % 2 == 0) {
		    for (int i = 0 ; i < n-1 ; i+=2) {
    		    int temp = nums[i];
    		    nums[i] = nums[i+1];
    		    nums[i+1] = temp;
	    	}
		} else {
		    for (int i = 0 ; i < n-2 ; i+=2) {
		        int temp = nums[i];
		        nums[i] = nums[i+1];
    		    nums[i+1] = temp;		    
		    }
		}
		
		for (int nu : nums) {
		    System.out.print(nu + " ");
		}
	}
}
