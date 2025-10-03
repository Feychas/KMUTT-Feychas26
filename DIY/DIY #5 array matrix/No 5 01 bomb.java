import java.util.Scanner;
public class DorDor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] nums = new int[r][c];
        
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++) {
                nums[i][j] = s.nextInt();
            } 
        }
        
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++) {
                if (nums[i][j] == 0) { //kalau nemu 0
                    for (int x = 0 ; x < c ; x++) { //nge 0 line x
                        if (nums[i][x] != 0) { //don't forget this biar ga hilang yg 0 in same line
                        nums[i][x] = 999;
                        }
                    }
                    for (int y = 0 ; y < r ; y++) { //nge 0 line y
                        if (nums[y][j] != 0) {
                        nums[y][j] = 999;
                        } //999 biar loop nya work, kalau 
                    } //lsg pakai 0, nanti smua bakal jadi 0
                }
            }
        }
        
        for (int i = 0 ; i < r ; i++) { //balikin 999 to 0
            for (int j = 0 ; j < c ; j++) {
                if (nums[i][j] == 999) {
                    nums[i][j] = 0;
                }
            }
        }
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++) {
                System.out.print(nums[i][j] + " ");
            } System.out.println();
        }
    }
}
