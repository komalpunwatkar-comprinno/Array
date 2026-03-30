package Array;
public class Second_largest_element {
    public static int second_largest(int[] arr){
        if (arr.length < 2) {
            return -1;  
        }
        int max= Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;

        for(int i=1; i<arr.length ; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }else if (arr[i]<max && arr[i]>smax){
                smax= arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE){
            return -1;
        }
        
        return smax;

    }

    public static void main (String [] args){
        int[]arr = {4, 2, 1, 8, 5};
        System.out.println(second_largest(arr));
    }
}