import java.util.Scanner;
public class RubikBomb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nbomb = s.nextInt();
        boolean[][][] rub = new boolean[5][5][5];
        
        for (int l = 0 ; l < nbomb ; l++) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            rub[x][y][z] = true; //tandain kalau dia dor
            
            for (int i = 0 ; i < 5 ; i++) { //dor x axis ats bwh vertikal
                rub[i][y][z] = true;
            }
            for (int j = 0 ; j < 5 ; j++) { //dor y axis knn kri horizontal
                rub[x][j][z] = true;
            }
            for (int k = 0 ; k < 5 ; k++) { //dor z axis dpn blkng horizontal
                rub[x][y][k] = true;
            }
        }
      
        int count = 0;
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                for (int k = 0 ; k < 5 ; k++) {
                    if (rub[i][j][k]) { //if it's true
                        count++;
                    }
        }   }   } 
        System.out.print(count);
    }
}


/* CAN USE boolean true false or 0/1 biar nanti outputnya shorter
    int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    count += cube[i][j][k];
                }
            }
        }
*/
