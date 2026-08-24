package Arrays.Logic_Building;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        //int num = 17;
        if(isPrime(num)) {
            System.out.println(num + "is Prime");
        }
        else{
            System.out.println(num+ "is not prime");
        }

    }
}
