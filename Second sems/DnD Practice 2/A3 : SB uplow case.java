import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        String[] arr = new String[n];

        //ini do all in loop input, but if sesuai input, dipisah, buat loop baru for iterartion
        for (int i = 0 ; i < n ; i++) {
            arr[i] = s.next();
            StringBuilder low = new StringBuilder();
            StringBuilder up = new StringBuilder();
            
            for (int j = 0 ; j < arr[i].length() ; j++) {
                char w = arr[i].charAt(j);
                
                if (j % 2 == 0) {
                    w = Character.toUpperCase(w);
                } else {
                    w = Character.toLowerCase(w);
                }
                
                if (Character.isLowerCase(w)) {
                    low.append(w);
                } else {
                    up.append(w);
                }
            }
            
            arr[i] = low.toString() + up.toString();
            System.out.print(arr[i] + " ");
        }
        //buat upper - lower gantian each char trs disusum
	}
}
