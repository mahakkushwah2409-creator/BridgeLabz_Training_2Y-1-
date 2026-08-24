package Arrays.Logic_Building;

public class PairSum {
    public static int pairSum(int arr[] , int target)
    {
        int pairCount =0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    pairCount++;

                }
            }
        }
        return pairCount;

    }
    public static void main(String[] args){

        int arr [] = { 1,2,3,4,5,6,7,8,9};
        int target =9 ;
        System.out.println("Count of pair sum " + pairSum(arr, target));
    }
}
