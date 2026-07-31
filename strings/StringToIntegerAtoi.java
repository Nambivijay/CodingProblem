/**
 * Problem: String to Integer (atoi)
 * Implement atoi which converts a string to an integer.
 * Time: O(n), Space: O(1)
 */
public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = s.charAt(i++) == '-' ? -1 : 1;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
        }
        return sign * result;
    }
    public static void main(String[] args) {
        StringToIntegerAtoi sol = new StringToIntegerAtoi();
        System.out.println(sol.myAtoi("42")); // 42
        System.out.println(sol.myAtoi("   -42")); // -42
        System.out.println(sol.myAtoi("4193 with words")); // 4193
    }
}