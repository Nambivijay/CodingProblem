/**
 * Problem: Single Number
 * Every element appears twice except one. Find that single one.
 * Time: O(n), Space: O(1)
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        System.out.println(sol.singleNumber(new int[]{2,2,1})); // 1
        System.out.println(sol.singleNumber(new int[]{4,1,2,1,2})); // 4
    }
}