package Arrays.Logic_Building;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);
        list.add(3,100);
        int[] nums = new int[5];
        for(int i =0 ; i < nums.length; i++) {
            nums[i]=list.get(i);
        }
        System.out.println("We Converted the ArrayList to into Array");
        System.out.println(Arrays.toString(nums));
    }
}
