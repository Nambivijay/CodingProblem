import java.util.*;
/**
 * Problem: Sliding Window Maximum
 * Return max of each sliding window of size k.
 * Time: O(n), Space: O(k)
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();
            deque.offerLast(i);
            if (i >= k - 1) result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }
    public static void main(String[] args) {
        SlidingWindowMaximum sol = new SlidingWindowMaximum();
        System.out.println(Arrays.toString(sol.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }
}