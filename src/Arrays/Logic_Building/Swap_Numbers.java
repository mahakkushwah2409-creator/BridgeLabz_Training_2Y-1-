package Arrays.Logic_Building;

public class Swap_Numbers {
    public static void Swap(int arr[] , int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        Display(arr);

    }

    static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Display(arr);
        Swap(arr , 2, 3);
        System.out.println();
    }
}
