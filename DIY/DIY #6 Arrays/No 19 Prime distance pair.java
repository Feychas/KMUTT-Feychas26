import java.util.Scanner;
import java.util.Arrays;
public class Primey {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int[] nums = new int[20];
        for (int i = 0 ; i < 20 ; i++) {
            nums[i] = x.nextInt();
        }
        
        //checkin prime, 0 = not prime
        for (int i = 0 ; i < 20 ; i++) {
            for (int j = 2 ; j * j <= nums[i] ; j++) {
                if (nums[i] <= 1) {
                nums[i] = 0;
                } else if (nums[i] % j == 0) {
                    nums[i] = 0;
                }
            }
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 1 ; i < 19  ; i++) {
            if (nums[i] != 0) {
                min = Math.min(min, nums[i + 1] - nums[i]);
            }
        }
        
        if (min == Integer.MAX_VALUE) {
            System.out.print("No prime pair was found.");
        } else {
        System.out.print(min);
        }
        
    }
}
