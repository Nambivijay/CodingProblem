import java.util.*;
/**
 * Problem: Roman to Integer
 * Convert Roman numeral to integer.
 * Time: O(n), Space: O(1)
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                result -= map.get(s.charAt(i));
            else result += map.get(s.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();
        System.out.println(sol.romanToInt("III")); // 3
        System.out.println(sol.romanToInt("MCMXCIV")); // 1994
    }
}