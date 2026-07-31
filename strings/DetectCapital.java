/**
 * Problem: Detect Capital
 * Check if usage of capitals is correct (ALL, none, or First only).
 * Time: O(n), Space: O(1)
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (char c : word.toCharArray()) if (Character.isUpperCase(c)) upperCount++;
        return upperCount == word.length() || upperCount == 0
            || (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
    public static void main(String[] args) {
        DetectCapital sol = new DetectCapital();
        System.out.println(sol.detectCapitalUse("USA")); // true
        System.out.println(sol.detectCapitalUse("Google")); // true
        System.out.println(sol.detectCapitalUse("FlaG")); // false
    }
}