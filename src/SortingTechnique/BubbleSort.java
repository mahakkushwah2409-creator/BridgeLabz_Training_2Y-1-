package SortingTechnique;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] ={3,2,1,4,5};
        for(int i=0 ; i<nums.length ;i++){
            for(int j=0 ; j<nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp =nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=0 ; i<nums.length ; i++) {
            System.out.print(nums[i]);
        }
    }
}
