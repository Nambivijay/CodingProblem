/**
 * Problem: Reverse String
 * Reverse a string in-place using two pointers.
 * Time: O(n), Space: O(1)
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left]; s[left] = s[right]; s[right] = temp;
            left++; right--;
        }
    }
    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        sol.reverseString(s);
        System.out.println(new String(s)); // olleh
    }
}