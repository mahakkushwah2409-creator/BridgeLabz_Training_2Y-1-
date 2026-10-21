package Strings.LogicBuilding;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Dinesh");
        System.out.println("to add append method " + str);
        str.insert(5,'X') ;
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(1,2);
        System.out.println(str);
        str.deleteCharAt(5);
        System.out.println(str);
    }
}
