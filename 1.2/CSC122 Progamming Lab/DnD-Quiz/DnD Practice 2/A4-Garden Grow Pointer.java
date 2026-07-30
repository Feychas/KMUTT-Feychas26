import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int r = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        
        int[][] gar = new int[r][c];
        
        //pointer array self, bawah, atas, kiri, kanan
        int[] dr = {0, -1, 1, 0, 0};
        int[] dc = {0, 0, 0, -1, 1};
        
        // for each day sejumlah total day
        for (int dy = 0 ; dy < d ; dy++) {
            int x = s.nextInt();
            int y = s.nextInt();
            
            //garden sementara
            int[][] next = new int[r][c];
            
            for (int i = 0 ; i < r ; i++) {
                for (int j = 0 ; j < c ; j++) {
                    if (gar[i][j] == 1) {
                        next[i][j] = 1;
                        
                        // for all pointers 
                        for (int k = 0 ; k < 5 ; k++) {
                            int nr = i + dr[k];
                            int nc = j + dc[k];
                            
                            // check edges
                            if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                                next[nr][nc] = 1;
                            }
                        }
                    }
                }
            }
            
            // change 
            next[x][y] = 1;
            gar = next; //reference to the next day 
        }
        
        int sum = 0;
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++) {
                sum += gar[i][j];
            }
        }
        
        System.out.print(sum);
        // for printing the garden result
        // for (int i = 0 ; i < r ; i++) {
        //     for (int j = 0 ; j < c ; j++) {
        //         System.out.print(gar[i][j] + " ");
        //     }
        // System.out.println();
        // }
	}
}
