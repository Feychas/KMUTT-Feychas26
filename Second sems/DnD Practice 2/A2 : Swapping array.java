import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int n = s.nextInt(); //size array
        int[] arr = new int[n];
        
        for (int i = 0 ; i < n ; i++) {
            arr[i] = s.nextInt();
        }
        
        for (int i = 0 ; i + x < n ; i++) {
            int temp = arr[i];
            arr[i] = arr[i + x];
            arr[i + x] = temp;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
}
