/**
 * Problem: Count and Say
 * Generate the nth term of the count-and-say sequence.
 * Time: O(n * length), Space: O(length)
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) count++;
                else { sb.append(count).append(result.charAt(j - 1)); count = 1; }
            }
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        return result;
    }
    public static void main(String[] args) {
        CountAndSay sol = new CountAndSay();
        System.out.println(sol.countAndSay(4)); // 1211
        System.out.println(sol.countAndSay(5)); // 111221
    }
}