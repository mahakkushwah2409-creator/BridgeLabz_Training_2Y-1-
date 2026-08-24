package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_977 {
    public static int[] sortedSquares(int[] nums) {

        for(int i=0 ;i<nums.length ; i++)
        {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,10,3};
        int answer[] = sortedSquares(nums);
        for(int i=0 ; i<nums.length ;i++){
            System.out.println(answer[i] + " ");
        }


    }
}
