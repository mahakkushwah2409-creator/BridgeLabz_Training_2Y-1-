package Arrays.Leetcode;

import java.util.Arrays;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int n = nums.length-1;

        reverse(nums, 0, n );      // step 1: reverse whole array
        reverse(nums, 0, k - 1);      // step 2: reverse first k elements
        reverse(nums, k, n );      // step 3: reverse remaining
    }
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
        public static void main (String[]args){
            Rotate_Array obj = new Rotate_Array();

            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            obj.rotate(nums, k);

            System.out.println(Arrays.toString(nums));


        }
    }
