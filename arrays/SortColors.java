import java.util.Arrays;
/**
 * Problem: Sort Colors (Dutch National Flag)
 * Sort array with values 0, 1, 2 in-place.
 * Time: O(n), Space: O(1)
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) { swap(nums, low++, mid++); }
            else if (nums[mid] == 1) { mid++; }
            else { swap(nums, mid, high--); }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
    }
    public static void main(String[] args) {
        SortColors sol = new SortColors();
        int[] arr = {2,0,2,1,1,0};
        sol.sortColors(arr);
        System.out.println(Arrays.toString(arr)); // [0,0,1,1,2,2]
    }
}