package Arrays.Leetcode;

public class Leetcode_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode_1295 obj = new Leetcode_1295();

        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(obj.findNumbers(nums));
        }

    }

