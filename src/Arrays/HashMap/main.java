package Arrays.HashMap;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap <String , Integer> studentAges = new HashMap<>();
        studentAges.put("Rahul" , 21);
        studentAges.put("Mayank" ,22);
        studentAges.put("Ayushi" ,20);
        System.out.println("Ayushi's age : " + studentAges.get("Ayushi"));
        studentAges.put("Ayushi" , 21);
        boolean hasMayank = studentAges.containsKey("Mayank");//true
        boolean hasAge20 = studentAges.containsValue(20); //false
        System.out.println(hasAge20);
        System.out.println(hasMayank);


    }
}
