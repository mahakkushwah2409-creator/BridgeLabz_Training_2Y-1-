package Arrays.Logic_Building;

import java.util.Scanner;

public class DigitsSum {
    public static int digitsum(int n) {
        int sum =0;
        while(n>0){
            int digit = n % 10;
            sum =sum + digit;
            n=n/10;
        }
        return sum ;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = digitsum(n);
        System.out.println("sum of digits is " + result);

    }

}
