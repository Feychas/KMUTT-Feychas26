import java.util.Scanner;
import java.util.Arrays;
public class Datasing {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int m = x.nextInt();
        int leng = n*m;
        int[] nums = new int[leng];
        //langsung buat as 1D array ja gpp toh ga butuh ngeprint bentuk matrix
        
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double avg, median;
        
        for (int i = 0 ; i < leng ; i++) {
            nums[i] = x.nextInt();
            sum += nums[i];
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        
        avg = (double) sum/(leng);
        Arrays.sort(nums);
        if (leng % 2 == 1) {
            median = nums[leng/2];
        } else {
            median = (nums[leng/2] + nums[(leng/2)-1]) / 2.0;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + avg);
        System.out.println("Median value: " + median);
        
    }
}
