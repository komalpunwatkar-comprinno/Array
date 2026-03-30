package Array;
public class Largest_element_in_array {
    public static int largest(int[] arr) {
        int max = arr[0];   // assume first element is largest
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        System.out.println(largest(arr));
    }
}