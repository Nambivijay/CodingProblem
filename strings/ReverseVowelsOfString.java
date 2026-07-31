/**
 * Problem: Reverse Vowels of a String
 * Reverse only the vowels of a string.
 * Time: O(n), Space: O(n)
 */
public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && vowels.indexOf(arr[left]) == -1) left++;
            while (left < right && vowels.indexOf(arr[right]) == -1) right--;
            char temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
            left++; right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        ReverseVowelsOfString sol = new ReverseVowelsOfString();
        System.out.println(sol.reverseVowels("hello")); // holle
        System.out.println(sol.reverseVowels("leetcode")); // leotcede
    }
}