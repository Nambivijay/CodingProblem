import java.util.PriorityQueue;
/**
 * Problem: Kth Largest Element in an Array
 * Find the kth largest element (not kth distinct).
 * Time: O(n log k), Space: O(k) using min-heap
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        KthLargestElement sol = new KthLargestElement();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(sol.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}