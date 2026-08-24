package Strings.Leetcode;

import java.util.Scanner;

public class Leetcode_387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0 ; i<s.length(); i++) {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
                System.out.println(i);
                return ;
            }
        }
        System.out.println(-1);
     }
}
