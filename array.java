public class array {
    static int [] nums = new int[100];
    static int n = 0;

    public static void insertend(int val){
        if(n < 100){
            nums[n] = val;
            n++;
        }
    }

    public static void insertatfront(int val){
        int i = 0;
        n++;
        for( i = n; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[i] = val;
        
    }

    public static void insertatloc(int val, int loc){
        n++;
        for(int i =n; i>= loc; i--){
            nums[i] = nums[i-1];
        }
        nums[loc-1] = val;
        
    }

    public static void deleteatlast(){
        n--;
    }

    public static void deleteatfront(){
        for(int i = 0; i<n; i++){
            nums[i] = nums[i+1];
        }
        n--;
    }

    public static void deleteatloc(int loc){
        for(int i = loc-1; i<n; i++){
            nums[i] = nums[i+1];
        }
        n--;
    }

    public static void display(){
        for(int i = 0 ; i<n; i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String [] args){
        insertend(2);
        insertend(4);
        insertend(6);
        insertatfront(8);
        insertatloc(10,3);
        deleteatlast();
        deleteatfront();
        deleteatloc(3);
        display();
    }
    
}
