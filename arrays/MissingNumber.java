/**
 * Problem: Missing Number
 * Given array containing n distinct numbers in [0, n], find the missing one.
 * Time: O(n), Space: O(1)
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        MissingNumber sol = new MissingNumber();
        System.out.println(sol.missingNumber(new int[]{3,0,1})); // 2
        System.out.println(sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // 8
    }
}