class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        
       for(int i=0; i<nums.length-1;i++){
        if(nums[i]+nums[i+1]== target){
            int a[]={i,i+1};
            return a;
            
        }
       }
     
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+2]== target){
            
        }
        }
       for(int i=0;i<nums.length-3;i++){
            if(nums[i]+nums[i+3]== target){
             int b []={i+i+3};
return b;
        }
       }
           if(nums[0]+nums[nums.length-1]==target){
          int c[]={0+nums.length-1};
          return c;
           }
           return null;
       }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        
       for(int i=0; i<nums.length-1;i++){
        if(nums[i]+nums[i+1]== target){
            int a[]={i,i+1};
            return a;
            
        }
       }
     
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+2]== target){
            
        }
        }
       for(int i=0;i<nums.length-3;i++){
            if(nums[i]+nums[i+3]== target){
             int b []={i+i+3};
return b;
        }
       }
           if(nums[0]+nums[nums.length-1]==target){
          int c[]={0+nums.length-1};
          return c;
           }
           return null;
       }
}















