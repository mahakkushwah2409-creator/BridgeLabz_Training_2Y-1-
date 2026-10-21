package Recursion.String;

public class CountOccurrence {
    public static int count(String name, int index, char ch) {
        if (index == name.length()) {
            return 0;
        }

        if (name.charAt(index) == ch) {
            return 1 + count(name, index + 1, ch);
        }

        return count(name, index + 1, ch);
    }
    public static void main(String[] args) {
        String name = "banana";
        char ch = 'a';

        System.out.println(count(name, 0, ch));
    }
}
