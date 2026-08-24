package Arrays.Logic_Building;

import java.util.Scanner;

public class Reverse_Array {
    public static void reverseArray(int arr[] ) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0 ; i< arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
        reverseArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
