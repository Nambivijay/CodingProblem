import java.util.*;
/**
 * Problem: Isomorphic Strings
 * Check if characters in s can be mapped to characters in t.
 * Time: O(n), Space: O(n)
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToT = new HashMap<>(), tToS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (sToT.containsKey(sc) && sToT.get(sc) != tc) return false;
            if (tToS.containsKey(tc) && tToS.get(tc) != sc) return false;
            sToT.put(sc, tc); tToS.put(tc, sc);
        }
        return true;
    }
    public static void main(String[] args) {
        IsomorphicStrings sol = new IsomorphicStrings();
        System.out.println(sol.isIsomorphic("egg", "add")); // true
        System.out.println(sol.isIsomorphic("foo", "bar")); // false
    }
}