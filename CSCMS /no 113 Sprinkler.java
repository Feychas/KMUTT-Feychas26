import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);

        int row = xx.nextInt();
        int col = xx.nextInt();

        int[] grow = new int[row];
        int[] gcol = new int[col];
        int[][] grid = new int[row][col]; //multiarray row isi col k smping

        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < col ; j++) {
                grid[i][j] = xx.nextInt(); //bikin grid buat diisi
                grow[i] += grid[i][j]; //each 1 increase tree count
                gcol[j] += grid[i][j]; //same but for col
            }
        }

        int max = 0; //starter max 0
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < col ; j++) {
                int water = grow[i] + gcol[j]; //jumlah pohon di row i n col j
                if (grid[i][j] == 1) { //biar ga double count
                    water--; 
                } 
                if (water > max) { //kalau ada max baru jadi new max
                    max = water;
                }
            }
        }
        System.out.print(max);
    }
}   



