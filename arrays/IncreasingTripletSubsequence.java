/**
 * Problem: Increasing Triplet Subsequence
 * Return true if there exists i < j < k with nums[i] < nums[j] < nums[k].
 * Time: O(n), Space: O(1)
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) first = num;
            else if (num <= second) second = num;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        IncreasingTripletSubsequence sol = new IncreasingTripletSubsequence();
        System.out.println(sol.increasingTriplet(new int[]{1,2,3,4,5})); // true
        System.out.println(sol.increasingTriplet(new int[]{5,4,3,2,1})); // false
    }
}