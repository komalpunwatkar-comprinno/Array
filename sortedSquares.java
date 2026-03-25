import java.util.Arrays;

public class sortedSquares {
    public int[] sorted_Squares(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        
    }

    public void main (String[]args){
        int [] nums= {-4, -1, 0, 3, 10};
        int [] result = new int[nums.length];
        result = sorted_Squares(nums);
        for(int i=0; i<nums.length; i++){
        System.out.println(result[i]+"");
        }
    }
    
}
