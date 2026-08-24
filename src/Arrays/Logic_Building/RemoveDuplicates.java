package Arrays.Logic_Building;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicate(int arr[])
    {
        for(int i =0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i] == arr[j]) {
                    arr[j] = -1;
                }
           }
        }
       for(int i=0 ; i< arr.length ; i++) {
           if(arr[i]!=-1) {
            System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i< arr.length ;i++) {
            arr[i] = sc.nextInt();

        }
        removeDuplicate(arr);
        sc.close();
    }
}
