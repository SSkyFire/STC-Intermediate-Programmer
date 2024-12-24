package Solution;


import java.util.Scanner;

public class stringInput {

    // Khai báo:
    static char[] A = new char[1000];
    static String B = "abc";
    static char[] C = "12345".toCharArray();

    // Nhập string từ input
    public static void input(char[] str) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.arraycopy(input.toCharArray(), 0, str, 0, input.length());
    }

    // Nhập 1 dòng từ input
    public static void inputLine(char[] str) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.arraycopy(input.toCharArray(), 0, str, 0, input.length());
    }

    // Tính độ dài
    public static int strLen(char[] str) {
        int len = 0;
        while (len < str.length && str[len] != '\0') {
            len++;
        }
        return len;
    }

    // Sao chép string và đồng thời trả về độ dài string
    public static int strCopy(char[] dest, char[] source) {
        int len = 0;
        while (len < source.length && source[len] != '\0') {
            dest[len] = source[len];
            len++;
        }
        if (len < dest.length) {
            dest[len] = '\0';
        }
        return len;
    }

    // So sánh string
    public static boolean isEqual(char[] s1, char[] s2) {
        int i = 0;
        while (i < s1.length && i < s2.length && s1[i] != '\0' && s2[i] != '\0') {
            if (s1[i] != s2[i]) {
                return false;
            }
            i++;
        }
        return i == s1.length || s1[i] == '\0';
    }

    // Đảo ngược string
    public static void reverse(char[] str) {
        int len = strLen(str);
        for (int i = 0; i < len / 2; i++) {
            char tmp = str[i];
            str[i] = str[len - i - 1];
            str[len - i - 1] = tmp;
        }
    }

    // Chuyển từ string sang số
    public static int atoi(char[] str) {
        int num = 0;
        for (int i = 0; i < str.length && str[i] != '\0'; i++) {
            num = num * 10 + (str[i] - '0');
        }
        return num;
    }

    // Chuyển từ số sang string
    public static void itoa(int num, char[] str) {
        int i = 0;
        while (num > 0) {
            str[i] = (char) (num % 10 + '0');
            num = num / 10;
            i++;
        }
        str[i] = '\0';
        reverse(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Test input
        char[] testInput = new char[1000];
        
        input(testInput);
        System.out.println(new String(testInput).trim());

        // Test inputLine
     
        inputLine(testInput);
        System.out.println(new String(testInput).trim());

        // Test strLen
        int length = strLen(testInput);
        System.out.println(length);

        // Test strCopy
        char[] copy = new char[1000];
        strCopy(copy, testInput);
        System.out.println(new String(copy).trim());

        // Test isEqual
        System.out.println(isEqual(testInput, B.toCharArray()));

        // Test reverse
        reverse(testInput);
        System.out.println(new String(testInput).trim());

        // Test atoi
        char[] numString = "12345".toCharArray();
        int number = atoi(numString);
        System.out.println(number);

        // Test itoa
        char[] numToString = new char[1000];
        itoa(number, numToString);
        System.out.println(new String(numToString).trim());
    }
}
