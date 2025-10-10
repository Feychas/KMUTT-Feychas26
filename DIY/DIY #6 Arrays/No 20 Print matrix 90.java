import java.util.Scanner;
public class Rotaty {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int[][] nums = new int[n][n];
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                nums[i][j] = x.nextInt();
            }
        }
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print(nums[n-j-1][i] + " ");
            } System.out.println();
        }
    }
}
