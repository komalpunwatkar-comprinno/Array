public class maximun_subarray {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
            if  (sum>result){
                result = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return result;

        
    }
    public void main (String[]args){
        int [] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums)); 
    }
    
}
