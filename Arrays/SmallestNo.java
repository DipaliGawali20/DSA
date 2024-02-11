import java.util.*;

public class SmallestNo {
    public static int smallNo(int nums[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println("The smallest No is  " + smallNo(nums));
    }
}