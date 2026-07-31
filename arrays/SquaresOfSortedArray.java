import java.util.Arrays;
/**
 * Problem: Squares of a Sorted Array
 * Return squares of each number sorted in non-decreasing order.
 * Time: O(n), Space: O(n)
 */
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
        while (left <= right) {
            int lsq = nums[left] * nums[left], rsq = nums[right] * nums[right];
            if (lsq > rsq) { result[pos--] = lsq; left++; }
            else { result[pos--] = rsq; right--; }
        }
        return result;
    }
    public static void main(String[] args) {
        SquaresOfSortedArray sol = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(sol.sortedSquares(new int[]{-4,-1,0,3,10}))); // [0,1,9,16,100]
    }
}