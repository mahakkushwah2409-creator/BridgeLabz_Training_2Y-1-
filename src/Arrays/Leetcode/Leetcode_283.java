package Arrays.Leetcode;

public class Leetcode_283 {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i =0 ; i<nums.length; i++) {
            if(nums[i]!=0) {
                int temp = nums[i] ;
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Leetcode_283 obj = new Leetcode_283();

        obj.moveZeroes(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }

    }
}
