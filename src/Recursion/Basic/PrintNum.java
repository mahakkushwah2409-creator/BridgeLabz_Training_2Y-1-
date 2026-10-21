package Recursion.Basic;

public class PrintNum {
    public static void printDec(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }

    public static void printInc(int m) {
        if(m==1) {
            System.out.println(m);
            return;
        }

        printInc(m-1);
        System.out.println(m+" ");
    }
    public static void main(String[] args) {
        printDec(10);
        printInc(10);
    }

}
