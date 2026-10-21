package Strings.LogicBuilding;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String result = new StringBuilder(str).reverse().toString();
        if(str.equals(result)) {
            System.out.println( str + " is palindrome");
        }
        else {
            System.out.println(str+ " is not palindrome");
        }
    }
}
