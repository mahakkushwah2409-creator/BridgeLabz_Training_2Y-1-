package Recursion.Arrays;

public class addElements {
    public static int sum(int arr[] , int index) {
        if(index== arr.length) {
            return 0;
        }
        int add= sum(arr ,index+1);
        return arr[index]+add;
    }
    public static void main(String[] args) {
        int arr[] ={ 3 ,45 ,5, 6,8};
        System.out.println(sum(arr , 5));

    }
}
