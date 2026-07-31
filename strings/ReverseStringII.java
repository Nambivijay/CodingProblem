/**
 * Problem: Reverse String II
 * Reverse first k chars for every 2k chars.
 * Time: O(n), Space: O(n)
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i, right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {
                char temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
                left++; right--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        ReverseStringII sol = new ReverseStringII();
        System.out.println(sol.reverseStr("abcdefg", 2)); // bacdfeg
    }
}