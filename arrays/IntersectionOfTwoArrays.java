import java.util.*;
/**
 * Problem: Intersection of Two Arrays II
 * Return intersection including duplicates.
 * Time: O(m+n), Space: O(min(m,n))
 */
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) map.merge(n, 1, Integer::sum);
        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (map.getOrDefault(n, 0) > 0) {
                result.add(n);
                map.merge(n, -1, Integer::sum);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        IntersectionOfTwoArrays sol = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(sol.intersect(new int[]{1,2,2,1}, new int[]{2,2}))); // [2,2]
    }
}