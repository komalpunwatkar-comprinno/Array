package Array;
public class contains_duplicate {
    public static boolean contains_Duplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i != j){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }

    public static void main(String[]args){
        int[] nums= {1,2,3,1};
        System.out.println(contains_Duplicate(nums));
    }
    
}
