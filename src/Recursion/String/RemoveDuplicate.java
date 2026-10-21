package Recursion.String;

public class RemoveDuplicate {

        public static String remove(String name, int index, String result) {
            if (index == name.length()) {
                return result;
            }

            char ch = name.charAt(index);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }

            return remove(name, index + 1, result);
        }

        public static void main(String[] args) {
            String name = "banana";
            System.out.println(remove(name, 0, ""));
        }
    }

