package comP;

import java.util.Arrays;

public class P3KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Arrays.sort(nums);
        System.out.println("Kth Largest Element = " + nums[nums.length - k]);
    }
}