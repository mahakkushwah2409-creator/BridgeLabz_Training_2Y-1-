package Arrays.Logic_Building;

public class AverageOfElements {
    public static double averageOfElements(int arr[]) {
        int sum =0;
        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        double average = averageOfElements(arr);

        System.out.println(average);


    }
}
