import java.util.Scanner;
import java.util.Arrays;
public class RibetCak {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int m = x.nextInt();
        int[][] numsmat = new int[n][m];
        //biar ga usah buat loop i j tiap kali
        int y = n*m;
        int[] nums = new int[y];
        
        int p = 0; //pointer buat input flat matrix
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                numsmat[i][j] = x.nextInt();
                nums[p] = numsmat[i][j];
                p++;
            }
        }
        
        //sum
        int sum = 0;
        for (int i = 0 ; i < y ; i++) {
            sum += nums[i];
        } System.out.println("Sum: " + sum);
        
        //minmax value
        int max = nums[0];
        int min = nums[0];
        for (int i = 0 ; i < y ; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        //average
        double avg = (double) sum / y;
        System.out.println("Average value: " + avg); //add (double) buat change format
        
        //median
        Arrays.sort(nums);
        double med;
        if (nums.length % 2 == 0) { //kalau even lsg equation
            med = (nums[nums.length/2 - 1] + nums[nums.length/2]) / 2.0; //atau pakai y-1
        } else {
            med = nums[nums.length/2];
        }
        System.out.println("Median value: " + med);
        
    }
}
