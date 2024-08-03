package org.example;

public class JavaPractiseMain {
    /**
     * In this implementation, the stringTimes method uses simple string concatenation inside a loop
     * to create the resulting string
     * The main method includes test cases to demonstrate how the method works.
     * @param str
     * @param n
     * @return string repeated char
     */
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringTimes("Hi", 2));  // Output: "HiHi"
        System.out.println(stringTimes("Hi", 3));  // Output: "HiHiHi"
        System.out.println(stringTimes("Hi", 1));  // Output: "Hi"
    }

    /**
     * The frontTimes method calculates the length of the "front" of the string
     *  which is the first 3 characters or fewer if the string is shorter than 3 characters.
     *  It then extracts the "front" using the substring method.
     *  It concatenates the "front" n times using a loop.
     * @param str
     * @param n
     * @return n times the front characters
     */

    public static String frontTimes(String str, int n) {
        int frontLength = Math.min(3, str.length());
        String front = str.substring(0, frontLength);

        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    /**
     * The countXX method initializes a counter count to zero.
     * It then iterates over the string, checking pairs of characters using the substring method.
     * If a pair of characters equals "xx", it increments the counter.
     * @param str
     * @return intiger of number of double X
     */

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }
}
