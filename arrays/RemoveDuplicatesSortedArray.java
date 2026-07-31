/**
 * Problem: Remove Duplicates from Sorted Array
 * Remove duplicates in-place and return new length.
 * Time: O(n), Space: O(1)
 */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray sol = new RemoveDuplicatesSortedArray();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int len = sol.removeDuplicates(arr);
        System.out.println("Length: " + len); // 5
    }
}