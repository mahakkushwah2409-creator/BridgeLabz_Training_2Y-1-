package Arrays.Leetcode;

import java.util.Scanner;

public class RunningSum {
        public static int[] runningSum(int[] nums) {


            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i];
            }

            return nums;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = runningSum(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
