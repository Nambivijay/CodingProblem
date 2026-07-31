import java.util.Arrays;
/**
 * Problem: Next Permutation
 * Rearrange numbers into the next lexicographically greater permutation.
 * Time: O(n), Space: O(1)
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }
    private void swap(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }
    private void reverse(int[] a, int l, int r) { while (l < r) swap(a, l++, r--); }
    public static void main(String[] args) {
        NextPermutation sol = new NextPermutation();
        int[] arr = {1,2,3};
        sol.nextPermutation(arr);
        System.out.println(Arrays.toString(arr)); // [1,3,2]
    }
}