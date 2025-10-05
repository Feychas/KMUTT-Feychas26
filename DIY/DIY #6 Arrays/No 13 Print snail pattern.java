import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        // Input number of rows and columns
        int r = x.nextInt();
        int c = x.nextInt();
        
        // Create the 2D array to store the numbers
        int[][] nums = new int[r][c];
        
        // Start filling numbers from 1
        int num = 1;
        
        for (int j = 0 ; j < c ; j++) { //first r go to right
            nums[0][j] = num++;
        }
        for (int i = 1 ; i < r ; i++) { //last c go to down
            nums[i][c-1] = num++;
        }
        if (r > 1) {
            for (int j = c - 2 ; j >= 0 ; j--) { //last r go to left
                nums[r-1][j] = num++;
            }
        }
        
        boolean LtoR = true;
        for (int i = r - 2 ; i >= 1 ; i--) { //buat decide, itung dari row
            if (LtoR) {
                for (int j = 0 ; j <= c - 2 ; j++) { //for Left to Right
                    nums[i][j] = num++;
                }
            } else { //for Right to Left
                for (int j = c - 2 ; j >= 0 ; j--) {
                    nums[i][j] = num++;
                }
            }
            LtoR = !LtoR; //buat balikin kanan kiri tiap r
        }

        // Print the resulting spiral pattern
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

/* ALTERNATIVE LOOP (zigzag full start from bottom row) N PRINT (for each loop)
int num = 1;
        for (int i = 0 ; i < c ; i++) {
            nums[0][i] = num++;
        }
        
        if (r > 1) {
            for (int i = 1 ; i < r ; i++) {
                nums[i][c-1] = num++;
            }
        }
        
        boolean LtoR = false;
        for (int i = r - 1 ; i > 0 ; i--) {
            if (LtoR) {
                for (int j = 0 ; j < c - 1 ; j++) {
                    nums[i][j] = num++; }
            } else {
                for (int j = c - 2 ; j >= 0 ; j--) {
                    nums[i][j] = num++; }
            }
        LtoR = !LtoR;
        }
        
        for (int[] numsay : nums) {
            for (int numsoy : numsay) {
                System.out.print(numsoy + " ");
            } System.out.println();
        }*/
