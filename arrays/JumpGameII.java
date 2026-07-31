/**
 * Problem: Jump Game II
 * Return minimum number of jumps to reach the last index.
 * Time: O(n), Space: O(1)
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) { jumps++; currentEnd = farthest; }
        }
        return jumps;
    }
    public static void main(String[] args) {
        JumpGameII sol = new JumpGameII();
        System.out.println(sol.jump(new int[]{2,3,1,1,4})); // 2
    }
}