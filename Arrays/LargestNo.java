import java.util.*;

public class LargestNo {
    public static int largeNo(int nums[]) {
        int largest = Integer.MIN_VALUE; // it is -infinity
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(largeNo(nums));
        int largest=Integer.MIN_VALUE
    }
}
