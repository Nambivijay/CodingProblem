/**
 * Problem: Implement strStr / Find the Index of First Occurrence
 * Return index of first occurrence of needle in haystack.
 * Time: O(n*m), Space: O(1)
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        ImplementStrStr sol = new ImplementStrStr();
        System.out.println(sol.strStr("sadbutsad", "sad")); // 0
        System.out.println(sol.strStr("leetcode", "leeto")); // -1
    }
}