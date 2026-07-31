import java.util.*;
/**
 * Problem: Restore IP Addresses
 * Return all valid IP addresses from a digit string.
 * Time: O(1) bounded, Space: O(1)
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(String s, int start, List<String> parts, List<String> result) {
        if (parts.size() == 4 && start == s.length()) { result.add(String.join(".", parts)); return; }
        if (parts.size() == 4 || start == s.length()) return;
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String part = s.substring(start, start + len);
            if ((part.length() > 1 && part.startsWith("0")) || Integer.parseInt(part) > 255) continue;
            parts.add(part);
            backtrack(s, start + len, parts, result);
            parts.remove(parts.size() - 1);
        }
    }
    public static void main(String[] args) {
        RestoreIPAddresses sol = new RestoreIPAddresses();
        System.out.println(sol.restoreIpAddresses("25525511135"));
    }
}