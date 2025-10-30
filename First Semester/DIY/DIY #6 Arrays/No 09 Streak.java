import java.util.Scanner;
public class Strava {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int d = x.nextInt();
        int[] days = new int[d];
        
        int y = 0;
        while (y < d) {
            days[y] = x.nextInt();
            y++;
        }
        
        int c = 0; //current cek
        int l = 0; //longest streak
        
        for (int i = 0 ; i < d ; i++) {
            if (days[i] > 10000) {
                c++;
            } else {
                c = 0; //kalau putus streak balik 0
               }
                if (c > l) {
                l = c;
               } 
            }
    if (l == 0 || l == 1) {        
        System.out.print(l + " day");
    } else {
        System.out.print(l + " days");
    }
}
}
