import java.util.*;
/**
 * Problem: Reorder Data in Log Files
 * Letter-logs before digit-logs, sorted by content then identifier.
 * Time: O(n log n * m), Space: O(n)
 */
public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] splitA = a.split(" ", 2), splitB = b.split(" ", 2);
            boolean isDigitA = Character.isDigit(splitA[1].charAt(0));
            boolean isDigitB = Character.isDigit(splitB[1].charAt(0));
            if (!isDigitA && !isDigitB) {
                int cmp = splitA[1].compareTo(splitB[1]);
                return cmp != 0 ? cmp : splitA[0].compareTo(splitB[0]);
            }
            return isDigitA ? (isDigitB ? 0 : 1) : -1;
        });
        return logs;
    }
    public static void main(String[] args) {
        ReorderDataInLogFiles sol = new ReorderDataInLogFiles();
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.toString(sol.reorderLogFiles(logs)));
    }
}