/**
 * Problem: Range Sum Query - Immutable
 * Calculate sum of elements between indices left and right.
 * Time: O(1) per query, Space: O(n)
 */
public class RangeSumQuery {
    private int[] prefix;
    public RangeSumQuery(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) prefix[i + 1] = prefix[i] + nums[i];
    }
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
    public static void main(String[] args) {
        RangeSumQuery sol = new RangeSumQuery(new int[]{-2,0,3,-5,2,-1});
        System.out.println(sol.sumRange(0, 2)); // 1
        System.out.println(sol.sumRange(2, 5)); // -1
        System.out.println(sol.sumRange(0, 5)); // -3
    }
}