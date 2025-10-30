import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int m = x.nextInt();
        
        int[][] nums = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                nums[i][j] = x.nextInt();
            }
        }
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                nums[i][j] = 255 - nums[i][j];
            }
        }
        
        //printing pakai for-each nested (krn 2d)
        for (int[] row : nums) {
            for (int col : row) {
                System.out.print(col + " "); 
            } System.out.println();
        }
        
    }
}
      /*Another kalau condition and print jadi 1 pakai for each loop
      for (int[] row : nums) {
          for (int numsi : row) {
               int inv = Math.abs(255-numsi);
               System.out.print(inv + " ");
           } System.out.println();
        }}}*/
