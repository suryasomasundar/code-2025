package strings;

/*
Given a string columnTitle that represents the column title as appears in an Excel sheet,
return its corresponding column number.

 */
public class ExcelSheetColumnNumber {

    public static int findColumnNumber(String columnTitle) {

        if (columnTitle == null || columnTitle.isEmpty()) return -1;

        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26;
            result += (columnTitle.charAt(i) - 'A') + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findColumnNumber("AB")); // Output: 28
        System.out.println(findColumnNumber("AA")); // Output: 27
        System.out.println(findColumnNumber("ZY")); // Output: 701
        System.out.println(findColumnNumber("A"));  // Output: 1
    }
}
