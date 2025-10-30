import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int f = x.nextInt();
        int r = x.nextInt();
        int z = x.nextInt();
        int[][][] lamp = new int[f][r][z];
        for (int i = 0 ; i < f ; i++) {
            for (int j = 0 ; j < r ; j++) {
                for (int k = 0 ; k < z ; k++) {
                    lamp[i][j][k] = x.nextInt();
        }}}
        int off = x.nextInt();
        int tfloor = z-1;
        for (int i = 0 ; i < r; i++) {
            for (int j = 0 ; j < z ; j++) {
            lamp[off-1][i][j] = 0;
         }
        }
        
        
        int count = 0;
        for (int i = 0 ; i < f ; i++) {
            for (int j = 0 ; j < r ; j++) {
                for (int k = 0 ; k < z ; k++) {
                    System.out.print(lamp[i][j][k] + " ");
                    if (lamp[i][j][k] == 1) {
                        count++;
                    } 
        } System.out.println();
            } System.out.println();
        }
        System.out.print("Total Lights On: " + count);
    }
}

/*ALTERNATIVE PRINTING
        int count = 0;
        for (int[][] siji : nums) {
            for (int[] loro : siji) {
                for (int telu : loro) {
                    if (telu == 1) {
                count++;
            }
                    System.out.print(telu + " ");
                } System.out.println();
            } System.out.println();
        } System.out.println("Total Lights On: " + count);*/
