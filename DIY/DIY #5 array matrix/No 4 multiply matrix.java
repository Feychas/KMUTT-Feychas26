import java.util.Scanner;

public class MaxMulMax {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        double[][] res = new double[3][3];
        
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                m1[i][j] = x.nextDouble();
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                m2[i][j] = x.nextDouble();
            }
        }
        //batas input
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                for (int k = 0 ; k < 3 ; k++) {
                    res[i][j] += m1[i][k] * m2[k][j]; //logika aja dr gambar, intinya 3 variabel loop
                } System.out.print(res[i][j] + " ");
            } System.out.println();
        } //langsung print, mff malas
    }
}
