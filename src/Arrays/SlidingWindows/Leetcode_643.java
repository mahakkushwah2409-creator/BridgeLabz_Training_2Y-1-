package Arrays.SlidingWindows;

import java.util.Scanner;

public class Leetcode_643 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<arr.length ;i++) {
            arr[i] =sc.nextInt();
        }
        int max=0;
        int sum =0;
        int k = sc.nextInt();
        for(int i=0 ; i<k ; i++) {
            sum = sum + arr[i];
        }
        max=sum;
        for(int i=0 ; i<arr.length-k; i++) {
            sum = sum - arr[i] + arr[i+k];
            max=Math.max(sum,max);
        }
        System.out.println(sum/k);
    }
}
