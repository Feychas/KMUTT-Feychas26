import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] nums = new int[9];
        for (int i = 0 ; i < 9 ; i++) {
            nums[i] = s.nextInt();
        }
        
        int tot = 0;
        if (nums[4] % 2 == 1) {
            for (int i = 1 ; i < 9 ; i+=2) {
                tot += nums[i];
            }
        } else {
            for (int j = 0 ; j < 9 ; j+=2) {
                tot += nums[j];
            }
        }
        
        System.out.print(tot);
    }
}
