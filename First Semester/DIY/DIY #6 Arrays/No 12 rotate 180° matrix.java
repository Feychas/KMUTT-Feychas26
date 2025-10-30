import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int m = x.nextInt();
        int[][] nums = new int[n][m];
        int[][] res = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                nums[i][j] = x.nextInt();
            }
        }
        //batas input
      
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                res[n - 1 - i][m - 1 - j] = nums[i][j]; //rumus rotate 180
        //flip hor and ver,the top -> bottom, left -> right
            }
        }
        //printing
         for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                System.out.print(res[i][j] + " ");
            } System.out.println();
         }
        /*Another way to print result
         for (int[] numsi : res) {
            for (int numsis : numsi) {
                System.out.print(numsis + " ");
            } System.out.println();
        }*/
    }
}
