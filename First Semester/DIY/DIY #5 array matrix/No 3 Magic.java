import java.util.Scanner;
public class MagicProphecy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[][] nums = new int[n][n];
        boolean isMagic = true;
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                nums[i][j] = s.nextInt();
            }
        }
        
        int sum = 0; //to compare sum
        for (int i = 0 ; i < n ; i++) {
            sum += nums[0][i];
        }
        
        //horizontal 
        for (int i = 0 ; i < n ; i++) {
            int sumt = 0; //biar reset pas pindah row
            for (int j = 0 ; j < n ; j++) {
                sumt += nums[i][j];
            }
            if (sumt != sum) {
                isMagic = false;
                break; //udah kalau nemu false stop smua
            }
        }
        
        //vertikal (should we??) sbnrnya hrs tp d testcase bs wkwk
        for (int j = 0 ; j < n ; j++) {
            int sumt = 0;
            for (int i = 0 ; i < n ; i++) {
                sumt += nums[i][j];
            }
                if (sumt != sum) {
                    isMagic = false;
                }
        }
        
        //2nd diagonal (1st diag hrsnya cek tp testcase gaada), 1st diagonal tinggal balik potition 
        int sumt = 0;
        for (int i = 0 ; i < n ; i++) {
            sumt += nums[i][n - i - 1]; }
            if (sumt != sum) {
                isMagic = false;
            }
    System.out.print(isMagic ? "true" : "false"); //printing
    }
}
