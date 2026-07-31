import java.util.*;
/**
 * Problem: Letter Combinations of a Phone Number
 * Return all letter combinations that a digit string could represent.
 * Time: O(4^n), Space: O(n)
 */
public class LetterCombinationsPhoneNumber {
    private static final String[] MAPPING = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }
    private void backtrack(String digits, int idx, StringBuilder sb, List<String> result) {
        if (idx == digits.length()) { result.add(sb.toString()); return; }
        for (char c : MAPPING[digits.charAt(idx) - '0'].toCharArray()) {
            sb.append(c);
            backtrack(digits, idx + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static void main(String[] args) {
        LetterCombinationsPhoneNumber sol = new LetterCombinationsPhoneNumber();
        System.out.println(sol.letterCombinations("23"));
    }
}