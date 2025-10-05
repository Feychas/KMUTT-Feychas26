//rumus transposed sih, intinya transpose xyz -> zyx    
          
import java.util.Scanner;
public class Tridi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int[][][] nums = new int[x][y][z];
        
        for (int i = 0 ; i < x ; i++) {
            for (int j = 0 ; j < y ; j++) {
                for (int k = 0 ; k < z ; k++) {
                    nums[i][j][k] = s.nextInt();
                }}}
                
        int[][][] trans = new int[z][y][x]; 
        
        for (int i = 0 ; i < x ; i++) {
            for (int j = 0 ; j < y ; j++) {
                for (int k = 0 ; k < z ; k++) {
                    trans[k][j][i] = nums[i][j][k];
                }}}
                
        for (int j = 0 ; j < y ; j++) {
            for (int k = 0 ; k < z ; k++) {
                for (int i = 0 ; i < x ; i++) {
                    System.out.print(trans[k][j][i] + " ");
                } System.out.println();
            } System.out.println();
    }
}
}
