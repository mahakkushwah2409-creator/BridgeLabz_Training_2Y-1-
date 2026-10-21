package Recursion.Arrays;

public class MaximumArray {
    public static int max(int arr[] , int index){
        if(index == arr.length -1){
            return arr[index];
        }
        int small = max(arr , index+1);
        return Math.max(small , arr[index]);
    }
    public static void main(String[] args) {
        int arr[] ={ 1,2,5,6,8,43};
        System.out.println(max(arr , 3));
    }
}
