/**
 * Problem: Container With Most Water
 * Find two lines that form a container holding the most water.
 * Time: O(n), Space: O(1)
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater sol = new ContainerWithMostWater();
        System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
    }
}