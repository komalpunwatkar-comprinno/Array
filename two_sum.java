public class two_sum{
    public static int[] twoSum(int[] nums ,int target){
        int [] x = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target- nums[i]== nums[j]){
                    x[0]=i;
                    x[1]=j;
                    return x;
                }
            }
        }
        return x;


    }
    public static void main (String [] args){
        int [] nums= {2, 7, 3,7, 8,0};
        int target=9;
        int [] result = twoSum(nums, target);
        System.out.println(result[0]+""+result[1]);
    }
}