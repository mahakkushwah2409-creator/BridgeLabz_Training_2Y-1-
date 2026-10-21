package Recursion.String;

public class ReverseString {
    public static void reverse(String s1, int index) {
        if (index == s1.length()) {
            return;
        }

        reverse(s1, index + 1);
        System.out.println(s1.charAt(index));
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        reverse(s1, 0);
    }
}