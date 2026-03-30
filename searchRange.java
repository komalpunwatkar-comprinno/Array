package Array;
public class searchRange{

    public static int[] search_Range(int[] nums, int target) {
        int[] x = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (x[0] == -1) {
                    x[0] = i;
                }
                x[1] = i;
            }
        }

        return x;
    }

    public static void main(String[] args) {

        int[] nums = {3, 7, 7, 8, 10};
        int target = 7;

        int[] result = search_Range(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}