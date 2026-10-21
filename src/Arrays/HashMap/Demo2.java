package Arrays.HashMap;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 5, 7, 9, 1, 3, 5, 5, 7, 8, 7};
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
              map.put(arr[i],map.getOrDefault(arr[i], 0) +1);
            }
            System.out.println(map);
        }
    }
