import java.util.Scanner;
import java.util.ArrayList;
public class Find {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int r = x.nextInt();
        int c = x.nextInt();
        int n = x.nextInt();
        int[][] nums = new int[r][c];
        
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++)
            nums[i][j] = x.nextInt();
        }
        
        ArrayList<String> numsi = new ArrayList<>(); //make arraylist for beberapa potition
        for (int i = 0 ; i < r ; i++) {
            for (int j = 0 ; j < c ; j++) {
                if (nums[i][j] == n) {
                    numsi.add("(" + i + "," + j + ")");
                }
            }
        }
        
        if (numsi.isEmpty()) {
            System.out.print("There is no number " + n + " in the matrix.");
        } else {
            System.out.print("Indices of number " + n + ":" + " ");
            for (int i = 0 ; i < numsi.size() ; i++) {
                System.out.print(numsi.get(i));
                if (i < numsi.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
