/**
 * Problem: Excel Sheet Column Number
 * Convert Excel title to column number (A->1, AB->28).
 * Time: O(n), Space: O(1)
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray())
            result = result * 26 + (c - 'A' + 1);
        return result;
    }
    public static void main(String[] args) {
        ExcelSheetColumnNumber sol = new ExcelSheetColumnNumber();
        System.out.println(sol.titleToNumber("A")); // 1
        System.out.println(sol.titleToNumber("AB")); // 28
        System.out.println(sol.titleToNumber("ZY")); // 701
    }
}