package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_1299 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = -1;
        for(int i=arr.length-1 ; i>=0 ; i--) {
            int temp = arr[i];
            arr[i] = max;
            max= Math.max(max,temp);
        }
        System.out.println(Arrays.toString(arr));
    }
}
