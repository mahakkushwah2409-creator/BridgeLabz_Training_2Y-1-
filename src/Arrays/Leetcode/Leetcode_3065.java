package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_3065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0 ; i<nums.length ; i++) {
            nums[i] = sc.nextInt();
        }
        int count =0;
        int k = sc.nextInt();
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]<k) {
                count++;
            }
        }
        System.out.println(count);

    }
}
