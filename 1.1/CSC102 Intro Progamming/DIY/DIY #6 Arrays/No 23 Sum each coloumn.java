import java.util.Scanner;
public class Summi {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int n = x.nextInt();
        int m = x.nextInt();
        int[][] nums = new int[n][m];
        int[] res = new int[m];
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                nums[i][j] = x.nextInt(); //scanner
                res[j] += nums[i][j]; //tiap col diisi per round i
            }
        }
        for (int j = 0 ; j < m ; j++) {
            System.out.println(res[j]);
        }
        
    }
}
