package Recursion.String;

public class ReplaceChar {
    public static String replace(String name, int index) {
        if (index == name.length()) {
            return "";
        }

        if (name.charAt(index) == 'a') {
            return 'b' + replace(name, index + 1);
        }

        return name.charAt(index) + replace(name, index + 1);
    }

    public static void main(String[] args) {
        String name = "banana";
        System.out.println(replace(name, 0));
    }
}
