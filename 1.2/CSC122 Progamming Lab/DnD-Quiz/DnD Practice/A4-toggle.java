import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] arr = new int[r][c];
		
		for (int i = 0 ; i < r ; i++) {
		    for (int j = 0 ; j < c ; j++) {
		        arr[i][j] = s.nextInt();
		    }
		}
		
		int br = s.nextInt();
		int bc = s.nextInt();		
		
		//direction for r and c
		int[] dr = {0, -1, 1, 0, 0};
        int[] dc = {0, 0, 0, -1, 1};

		for (int k = 0; k < 5; k++) {
		    //arah sementara
            int nr = br + dr[k];
            int nc = bc + dc[k];
            
            //check no more than border
            if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                arr[nr][nc] = 1 - arr[nr][nc];
                //if its 0 -> 1 , 1 -> 0
            }
        }
        
        //printing 
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            } System.out.println();
        }

		
	}
}
