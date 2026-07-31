import java.util.*;
/**
 * Problem: Majority Element II
 * Find all elements appearing more than n/3 times.
 * Time: O(n), Space: O(1)
 */
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0, count1 = 0, count2 = 0;
        for (int n : nums) {
            if (n == c1) count1++;
            else if (n == c2) count2++;
            else if (count1 == 0) { c1 = n; count1 = 1; }
            else if (count2 == 0) { c2 = n; count2 = 1; }
            else { count1--; count2--; }
        }
        count1 = 0; count2 = 0;
        for (int n : nums) { if (n == c1) count1++; else if (n == c2) count2++; }
        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(c1);
        if (count2 > nums.length / 3) result.add(c2);
        return result;
    }
    public static void main(String[] args) {
        MajorityElementII sol = new MajorityElementII();
        System.out.println(sol.majorityElement(new int[]{3,2,3})); // [3]
        System.out.println(sol.majorityElement(new int[]{1,2})); // [1,2]
    }
}