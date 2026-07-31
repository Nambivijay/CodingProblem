import java.util.*;
/**
 * Problem: Group Shifted Strings
 * Group strings that belong to the same shifting sequence.
 * Time: O(n * m), Space: O(n * m)
 */
public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            StringBuilder key = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                int diff = (s.charAt(i) - s.charAt(i - 1) + 26) % 26;
                key.append(diff).append(',');
            }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupShiftedStrings sol = new GroupShiftedStrings();
        System.out.println(sol.groupStrings(new String[]{"abc","bcd","acef","xyz","az","ba","a","z"}));
    }
}