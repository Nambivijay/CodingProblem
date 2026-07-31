import java.util.Arrays;
/**
 * Problem: 3Sum Closest
 * Find three integers whose sum is closest to target.
 * Time: O(n^2), Space: O(1)
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;
                if (sum < target) left++;
                else if (sum > target) right--;
                else return sum;
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        ThreeSumClosest sol = new ThreeSumClosest();
        System.out.println(sol.threeSumClosest(new int[]{-1,2,1,-4}, 1)); // 2
    }
}