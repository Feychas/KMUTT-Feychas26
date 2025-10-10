import java.util.Scanner;
public class Primey {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int num = x.nextInt();
        int[] nums = new int[num];
        for (int i = 1 ; i <= num ; i++) {
            nums[i-1] = i;
        }
        
        // int cun = 2;
        // while (nums[i] * nums[i] <= n) {
        //     for (int i = 0 ; i < num ; i++) {
        //         nums[i] % cun = 
        //     }
        // } this is the easy way actually, the short formula

      
      // ini formula ngikutin teori logika soal yang diminta walau hasilnya ya sama aja soal prime number  
        for (int i = 0 ; i < num ; i++) { //we gonna make every non prime = 0
            if (nums[i] % 2 == 0 && nums[i] != 2) {
                nums[i] = 0;
            } else if (nums[i] % 3 == 0 && nums[i] != 3) {
                nums[i] = 0;
            } else if (nums[i] % 5 == 0 && nums[i] != 5) {
                nums[i] = 0;
            } else if (nums[i] % 7 == 0 && nums[i] != 7) {
                nums[i] = 0;
            }
        }
        
        for (int i = 0 ; i < num ; i++) {
            if (nums[i] != 0 && nums[i] != 1) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
