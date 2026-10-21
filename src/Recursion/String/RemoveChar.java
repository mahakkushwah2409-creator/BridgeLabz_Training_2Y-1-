package Recursion.String;

public class RemoveChar {
    public static String remove(String name, int index, char ch) {
        if (index == name.length()) {
            return "";
        }

        if (name.charAt(index) == ch) {
            return remove(name, index + 1, ch);
        }

        return name.charAt(index) + remove(name, index + 1, ch);
    }

    public static void main(String[] args) {
        String name = "banana";
        char ch = 'a';

        System.out.println(remove(name, 0, ch));
    }
}
