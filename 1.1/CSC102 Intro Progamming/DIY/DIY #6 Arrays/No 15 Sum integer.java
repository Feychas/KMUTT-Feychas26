import java.util.Scanner;
import java.util.Arrays;
public class SumSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int[] nums = new int[5];
        for (int i = 0 ; i < 5 ; i++) {
            nums[i] = x.nextInt();
        }
        
        Arrays.sort(nums); //gatau knp ahrus disort
        int sumax = 0 , sumin = 0;
        for (int i = 0 ; i < 4 ; i++) {
            sumin += nums[i];
        }
        for (int i = 1 ; i < 5 ; i++) {
            sumax += nums[i];
        }
        
        System.out.print(sumin + " " + sumax);
    }
}
