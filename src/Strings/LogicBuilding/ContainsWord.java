package Strings.LogicBuilding;

import java.util.Scanner;

public class ContainsWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        if(sentence.contains(word)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
