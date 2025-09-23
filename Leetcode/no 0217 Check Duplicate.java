import java.util.Scanner;
import java.util.Arrays; //don't forget to import array for sort etc
public class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    int[] nums = new int[5]; //use max 5 as example karena ga d mention di question
    //input
    int n = 0;
    while (n < 5) {
      nums[n] = x.nextInt();
      n++;
    }
    
    Arrays.sort(nums); //sort dulu
        for (int i = 0 ; i < nums.length - 1 ; i++) { //karena gaperlu cek index terakhir
                if (nums[i] == nums[i + 1]) { //karena udah di sort, kalau nemu yang sama +1 pasti kedeteksi
                    System.out.print("true");
    } else {
        System.out.print("false");
    }
    break; //jangan lupa break di outside loop biar ga keprint bolak balik
  }
}
}
