import java.util.Arrays;
/**
 * Problem: Plus One
 * Increment a large integer represented as an array of digits.
 * Time: O(n), Space: O(n) worst case
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { digits[i]++; return digits; }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        PlusOne sol = new PlusOne();
        System.out.println(Arrays.toString(sol.plusOne(new int[]{1,2,3}))); // [1,2,4]
        System.out.println(Arrays.toString(sol.plusOne(new int[]{9,9,9}))); // [1,0,0,0]
    }
}