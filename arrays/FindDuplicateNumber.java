/**
 * Problem: Find the Duplicate Number
 * Find duplicate in array of n+1 integers in range [1,n].
 * Time: O(n), Space: O(1) - Floyd's Tortoise and Hare
 */
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);
        slow = nums[0];
        while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
        return slow;
    }
    public static void main(String[] args) {
        FindDuplicateNumber sol = new FindDuplicateNumber();
        System.out.println(sol.findDuplicate(new int[]{1,3,4,2,2})); // 2
        System.out.println(sol.findDuplicate(new int[]{3,1,3,4,2})); // 3
    }
}