package Recursion.String;

public class EqualString {

        public static boolean check(String s1, String s2, int index) {
            if (index == s1.length() && index == s2.length()) {
                return true;
            }

            if (index == s1.length() || index == s2.length()) {
                return false;
            }

            if (s1.charAt(index) != s2.charAt(index)) {
                return false;
            }

            return check(s1, s2, index + 1);
        }

        public static void main(String[] args) {
            String s1 = "hello";
            String s2 = "hello";

            System.out.println(check(s1, s2, 0));
        }
    }

