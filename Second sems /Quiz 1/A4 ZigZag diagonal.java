import java.util.*;

public class ZIgZagDiagonalPattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int r = s.nextInt();
    int c = s.nextInt();
    int[][] arr = new int[r][c];

    int f = 1; //filling
    //diagonal = i + j, -1 cuz index. this represent each d
    for (int d = 0 ; d < r + c - 1 ; d++) {
      if (d % 2 == 0) { //iff even, top to bot
        for (int i = d ; i >= 0 ; i--) {
          int j = d-i;
          if (i < r && j < c) {
            arr[i][j] = f++;
          }
        }
      } else { //odd, bot to top
          for (int i = 0 ; i <= d ; i++) {
            int j = d - i;
            if (i < r && j < c) {
              arr[i][j] = f++;
            }
          }
      }
    }
    
    for (int[] p1 : arr) {
      for (int p2 : p1) {
        System.out.print(p2 + " ");
      } System.out.println();
    }
  }
}