import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0 ; i < n ; i++) { 
            sum1 += nums[i][i]; //diagonal kiri kanan
            sum2 += nums[i][n-1-i]; //diagonal kanan kiri
        }
        int sum = sum1 - sum2;
        int res = Math.abs(sum);
        System.out.print(res);
    }
}

/* ALTERNATIVE
    int d1 = 0, d2 = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int val = sc.nextInt();
            if (i == j)
                d1 += val;
            if (i + j == n - 1)
                d2 += val;
            }
        }
        System.out.println(Math.abs(d1 - d2));
*/
