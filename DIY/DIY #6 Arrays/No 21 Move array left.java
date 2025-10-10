import java.util.Scanner;
public class Left {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int[] nums = new int[n];
        int y = 0;
        while (y < n) {
            nums[y] = x.nextInt();
            y++;
        }
        
        int first = nums[0];
        for (int i = 0 ; i < n-1 ; i++) {
            nums[i] = nums[i+1];
        }
        
        nums[n-1] = first;
        
        for (int i = 0 ; i < n ; i++) {
        System.out.print(nums[i] + " ");
        }
        
    }
}
