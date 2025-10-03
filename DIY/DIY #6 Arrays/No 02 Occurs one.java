import java.util.Scanner;
import java.util.Arrays;
public class Single {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int t = x.nextInt();
        int[] nums = new int[t];
        
        int p = 0;
        while (p < t) {
            nums[p] = x.nextInt();
            p++;
        }
        
    
        Arrays.sort(nums); //sort pasti yg double sblhn
        for (int i = 0 ; i < t ; i+=2) { //+2 karena sblhn
            if (i == t - 1 || nums[i] != nums[i+1]) { 
        //(t-1) biar kalau udah reach end ya berarti itu yg beda, biar g time out
                System.out.print(nums[i]);
                break; //done is done
            }
        }
    }
}
