import java.util.*;
/**
 * Problem: Decode String
 * Decode encoded string like "3[a2[c]]" -> "accaccacc".
 * Time: O(n), Space: O(n)
 */
public class DecodeString {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { k = k * 10 + (c - '0'); }
            else if (c == '[') { countStack.push(k); stringStack.push(current); current = new StringBuilder(); k = 0; }
            else if (c == ']') {
                int count = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < count; i++) decoded.append(current);
                current = decoded;
            } else current.append(c);
        }
        return current.toString();
    }
    public static void main(String[] args) {
        DecodeString sol = new DecodeString();
        System.out.println(sol.decodeString("3[a]2[bc]")); // aaabcbc
        System.out.println(sol.decodeString("3[a2[c]]")); // accaccacc
    }
}