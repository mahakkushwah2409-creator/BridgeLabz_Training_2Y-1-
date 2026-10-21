package Recursion.Arrays;

public class SearchElement {
    public static int search(int arr[] , int index , int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr,index+1 , target);
    }
    public static void main(String[] args) {
        int arr[] = {1 ,54, 2 , 8 ,4};
        System.out.println(search(arr , 3 , 2));
    }
}
