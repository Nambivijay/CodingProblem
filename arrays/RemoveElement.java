/**
 * Problem: Remove Element
 * Remove all occurrences of val in-place and return new length.
 * Time: O(n), Space: O(1)
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) nums[k++] = num;
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveElement sol = new RemoveElement();
        int[] arr = {3,2,2,3};
        System.out.println("New length: " + sol.removeElement(arr, 3)); // 2
    }
}