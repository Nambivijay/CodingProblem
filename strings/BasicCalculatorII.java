import java.util.*;
/**
 * Problem: Basic Calculator II
 * Evaluate expression with +, -, *, / (no parentheses).
 * Time: O(n), Space: O(n)
 */
public class BasicCalculatorII {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0; char op = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) num = num * 10 + (c - '0');
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (op == '+') stack.push(num);
                else if (op == '-') stack.push(-num);
                else if (op == '*') stack.push(stack.pop() * num);
                else if (op == '/') stack.push(stack.pop() / num);
                op = c; num = 0;
            }
        }
        int result = 0;
        for (int n : stack) result += n;
        return result;
    }
    public static void main(String[] args) {
        BasicCalculatorII sol = new BasicCalculatorII();
        System.out.println(sol.calculate("3+2*2")); // 7
        System.out.println(sol.calculate(" 3/2 ")); // 1
        System.out.println(sol.calculate(" 3+5 / 2 ")); // 5
    }
}