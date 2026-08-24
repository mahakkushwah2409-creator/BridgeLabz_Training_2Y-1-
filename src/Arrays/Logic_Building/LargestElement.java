package Arrays.Logic_Building;

public class LargestElement {
    public static int maxValue(int arr[] ){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {7,2,3,7,5,6,7};
        System.out.println("max Element is :" + maxValue(arr));


    }
}
