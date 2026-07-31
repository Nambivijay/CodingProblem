/**
 * Problem: String Compression
 * Compress char array using counts of consecutive repeated chars.
 * Time: O(n), Space: O(1)
 */
public class StringCompression {
    public int compress(char[] chars) {
        int write = 0, read = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == current) { read++; count++; }
            chars[write++] = current;
            if (count > 1) for (char c : String.valueOf(count).toCharArray()) chars[write++] = c;
        }
        return write;
    }
    public static void main(String[] args) {
        StringCompression sol = new StringCompression();
        char[] chars = {'a','a','b','b','c','c','c'};
        int len = sol.compress(chars);
        System.out.println("Length: " + len); // 6 -> a2b2c3
    }
}