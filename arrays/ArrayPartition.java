import java.util.Arrays;
/**
 * Problem: Array Partition
 * Maximize sum of min(ai, bi) for pairs.
 * Time: O(n log n), Space: O(1)
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) sum += nums[i];
        return sum;
    }
    public static void main(String[] args) {
        ArrayPartition sol = new ArrayPartition();
        System.out.println(sol.arrayPairSum(new int[]{1,4,3,2})); // 4
        System.out.println(sol.arrayPairSum(new int[]{6,2,6,5,1,2})); // 9
    }
}