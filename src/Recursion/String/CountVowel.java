package Recursion.String;

public class CountVowel {
    public static int countVowel(String name , int index) {
        if(index==name.length()){
            return 0 ;
        }
        char ch =Character.toLowerCase(name.charAt(index));
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
            return 1 + countVowel(name , index+1);
        }
        return countVowel(name , index+1);
    }
    public static void main(String[] args) {
        String name = "Mayank";
        System.out.println(countVowel(name ,0));
    }
}
