import java.util.Scanner;

public class Permut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // read number count
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // read all numbers into array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // ===============================
        // 🔹 STEP 1: Find the first pair (from right) where nums[i] < nums[i+1]
        // Example: 1 3 2 → found at i=0 (1 < 3)
        // ===============================
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // ===============================
        // 🔹 STEP 2: If such i exists, find the next bigger number to swap
        // Find the smallest number on right side of i that is larger than nums[i]
        // ===============================
        if (i >= 0) {
            int j = n - 1;
            // move from right to find number just bigger than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }

            // 🔁 swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // ===============================
        // 🔹 STEP 3: Reverse all numbers after position i
        // to make them the smallest possible order
        // Example: after swap → 2 3 1 → reverse right side → 2 1 3
        // ===============================
        int start = i + 1, end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        // ===============================
        // 🔹 STEP 4: Print result
        // ===============================
        for (int x = 0; x < n; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
