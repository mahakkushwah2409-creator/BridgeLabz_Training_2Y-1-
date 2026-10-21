package Recursion.String;

public class StringLength {
    public static int length(String name, int index) {
        if (index == name.toCharArray().length) {
            return 0;
        }

        return 1 + length(name, index + 1);
    }

    public static void main(String[] args) {
        String name = "Hello";
        System.out.println(length(name, 0));
        }
    }

