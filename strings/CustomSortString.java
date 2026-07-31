/**
 * Problem: Custom Sort String
 * Sort string s so that characters follow the order in string order.
 * Time: O(n), Space: O(n)
 */
public class CustomSortString {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray())
            while (count[c - 'a']-- > 0) sb.append(c);
        for (int i = 0; i < 26; i++)
            while (count[i]-- > 0) sb.append((char)('a' + i));
        return sb.toString();
    }
    public static void main(String[] args) {
        CustomSortString sol = new CustomSortString();
        System.out.println(sol.customSortString("cba", "abcd")); // cbad
    }
}