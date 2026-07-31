/**
 * Problem: House Robber II
 * Houses arranged in circle. Rob max without adjacent.
 * Time: O(n), Space: O(1)
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length - 1));
    }
    private int robRange(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1; prev1 = temp;
        }
        return prev1;
    }
    public static void main(String[] args) {
        HouseRobberII sol = new HouseRobberII();
        System.out.println(sol.rob(new int[]{2,3,2})); // 3
        System.out.println(sol.rob(new int[]{1,2,3,1})); // 4
    }
}