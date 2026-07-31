/**
 * Problem: Excel Sheet Column Title
 * Convert column number to Excel title (1->A, 28->AB).
 * Time: O(log n), Space: O(log n)
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.insert(0, (char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ExcelSheetColumnTitle sol = new ExcelSheetColumnTitle();
        System.out.println(sol.convertToTitle(1)); // A
        System.out.println(sol.convertToTitle(28)); // AB
        System.out.println(sol.convertToTitle(701)); // ZY
    }
}