import java.util.*;

public class NumsPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0 ; i < n ; i++) {
      arr[i] = sc.nextInt();
    }
    
    int sum = 0;
    for (int i = 0 ; i < n ; i++) {
      String s = String.valueOf(arr[i]);
      boolean isPalin = true;
      for (int j = 0 ; j < s.length()/2 ; j++) {
        if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
          isPalin = false;
          break;
        }
      } 
      if (isPalin) {
        sum++;
      }

    }
    System.out.println(sum);
  }
}