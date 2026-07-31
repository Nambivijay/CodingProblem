/**
 * Problem: Decode Ways
 * Count ways to decode a digit string (A=1, B=2, ..., Z=26).
 * Time: O(n), Space: O(1)
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int prev2 = 1, prev1 = 1;
        for (int i = 1; i < s.length(); i++) {
            int curr = 0;
            if (s.charAt(i) != '0') curr = prev1;
            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
            if (twoDigit >= 10 && twoDigit <= 26) curr += prev2;
            prev2 = prev1; prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        DecodeWays sol = new DecodeWays();
        System.out.println(sol.numDecodings("12")); // 2
        System.out.println(sol.numDecodings("226")); // 3
        System.out.println(sol.numDecodings("06")); // 0
    }
}