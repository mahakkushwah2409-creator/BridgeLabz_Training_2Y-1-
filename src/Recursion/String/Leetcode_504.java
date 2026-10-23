
package Recursion.String;

public class Leetcode_504 {

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        num = Math.abs(num);

        String ans = "";

        while (num > 0) {
            int rem = num % 7;
            ans = rem + ans;
            num = num / 7;
        }

        if (negative) {
            ans = "-" + ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
        System.out.println(convertToBase7(0));
    }
}
