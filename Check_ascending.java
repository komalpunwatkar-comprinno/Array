public class Check_ascending {
    public static boolean Check_if_ascending(int[]arr){
        
        for(int i=1; i < arr.length ; i++){
            
            if(arr[i]<arr[i-1]){
                return false;
            }
            
        }
        return true;
    }
    
    public static void main (String []args){
        int[]arr = {1, 8, 3, 4, 5};
        System.out.println(Check_if_ascending(arr));
    }
}
