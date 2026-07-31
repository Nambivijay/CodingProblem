/**
 * Problem: Valid Palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads
 * the same forward and backward.
 * 
 * Example:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: " + solution.isPalindrome(s1));

        String s2 = "race a car";
        System.out.println("\nInput: \"" + s2 + "\"");
        System.out.println("Output: " + solution.isPalindrome(s2));

        String s3 = " ";
        System.out.println("\nInput: \" \"");
        System.out.println("Output: " + solution.isPalindrome(s3));

        String s4 = "Was it a car or a cat I saw?";
        System.out.println("\nInput: \"" + s4 + "\"");
        System.out.println("Output: " + solution.isPalindrome(s4));
    }
}
