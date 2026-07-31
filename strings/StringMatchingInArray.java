import java.util.*;
/**
 * Problem: String Matching in an Array
 * Return strings that are substrings of another word in the array.
 * Time: O(n^2 * m), Space: O(n)
 */
public class StringMatchingInArray {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (i != j && words[j].contains(words[i])) { result.add(words[i]); break; }
        return result;
    }
    public static void main(String[] args) {
        StringMatchingInArray sol = new StringMatchingInArray();
        System.out.println(sol.stringMatching(new String[]{"mass","as","hero","superhero"})); // [as, hero]
    }
}