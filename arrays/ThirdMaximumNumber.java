/**
 * Problem: Third Maximum Number
 * Return the third distinct maximum. If not exist, return the maximum.
 * Time: O(n), Space: O(1)
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == first || num == second || num == third) continue;
            if (num > first) { third = second; second = first; first = num; }
            else if (num > second) { third = second; second = num; }
            else if (num > third) { third = num; }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
    public static void main(String[] args) {
        ThirdMaximumNumber sol = new ThirdMaximumNumber();
        System.out.println(sol.thirdMax(new int[]{3,2,1})); // 1
        System.out.println(sol.thirdMax(new int[]{2,1})); // 2
    }
}