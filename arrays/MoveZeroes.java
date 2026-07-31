import java.util.Arrays;
/**
 * Problem: Move Zeroes
 * Move all 0's to the end while maintaining relative order.
 * Time: O(n), Space: O(1)
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length) nums[insertPos++] = 0;
    }
    public static void main(String[] args) {
        MoveZeroes sol = new MoveZeroes();
        int[] arr = {0,1,0,3,12};
        sol.moveZeroes(arr);
        System.out.println(Arrays.toString(arr)); // [1,3,12,0,0]
    }
}