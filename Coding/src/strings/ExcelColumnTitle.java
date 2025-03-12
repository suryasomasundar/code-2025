package strings;

public class ExcelColumnTitle {

    /*

    Given an integer columnNumber,
    return its corresponding column title as it appears in an Excel sheet.
     */

    public static String convertTitle(int columnNumber) {

        String result = "";

        while (columnNumber > 0) {
            columnNumber--;
            result = (char) ('A' + columnNumber % 26) + result;
            columnNumber /= 26;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertTitle(28)); // Output: AB
        System.out.println(convertTitle(27)); // Output: AA
        System.out.println(convertTitle(701)); // Output: ZY
        System.out.println(convertTitle(1)); // Output: A
    }
}
