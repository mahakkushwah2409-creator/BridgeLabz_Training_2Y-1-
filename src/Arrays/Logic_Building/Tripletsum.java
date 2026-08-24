package Arrays.Logic_Building;

public class Tripletsum {
    public static int tripletSum(int arr[] , int target) {
        int TripleCount =0;
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length; j++) {
                for( int k = j+1 ; k< arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        TripleCount++;
                    }
                }
            }

        }
        return TripleCount;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        System.out.println("count of Triple sum : " + tripletSum(arr,target));
    }
}
