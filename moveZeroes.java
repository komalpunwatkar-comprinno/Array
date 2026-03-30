package Array;
public class moveZeroes {
    public void move_Zeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]+"");
        }
    }

    public void main(String [] args){
        int [] nums={0,1,0,3,12};
        move_Zeroes(nums); 
    }
    
}
