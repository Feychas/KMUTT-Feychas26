import java.util.Scanner;
public class RemoveSorted {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    int[] nums = new int[5]; //use max 5 as example karena ga d mention di question

    //input
    int n = 0;
    while (n < 5) {
      nums[n] = x.nextInt();
      n++;
    }
    
    int k = 1; //start 1 krn pasti ada 1 dan nyesuaiin i
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i] != nums[i-1]) { //kalau i ga sama kaya sebelumnya
                nums[k] = nums[i]; //berarti potition stay
                k++;
            }
        }
        System.out.println(k); //k is number unik itu a.k.a jumlah yang diitung
        for (int i = 0 ; i < nums.length ; i++) { //loop print isi array
            System.out.print(nums[i]+ " ");
    }
  }
}
