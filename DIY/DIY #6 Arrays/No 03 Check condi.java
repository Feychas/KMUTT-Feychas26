import java.util.Scanner;
public class Mat {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int m = x.nextInt();
        int n = x.nextInt();
        int[][] nums = new int[m][n];
        boolean isTrue = true;
        
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                nums[i][j] = x.nextInt();
            }
        }
        
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
            if ((i > 0 && nums[i][j] !=  nums[i-1][j]) || (j > 0 && nums[i][j] == nums[i][j-1])) {
                isTrue = false;
            }
            }
        }
        
        System.out.print(isTrue);
    }
}
