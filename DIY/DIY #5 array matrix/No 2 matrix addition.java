import java.util.Scanner;
public class AdditionMatrix {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];
        double[][] res = new double[2][2];
        
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                m1[i][j] = x.nextDouble();
            }
        }
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                m2[i][j] = x.nextDouble();
            }
        }
        //batas input
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
                System.out.print(res[i][j] + " ");
            } System.out.println();
        } 
    }
}

/* SAME THO BUT NO NEW RESSULT ARRAY
import java.util.Scanner;
public class MatrixPlus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];
        
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                m1[i][j] = x.nextDouble();
            }
        }
        
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                m2[i][j] = x.nextDouble();
            }
        }
        
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                m1[i][j] += m2[i][j];
                System.out.print(m1[i][j] + " ");
            } System.out.println();
        }
        
    }
}

*/
