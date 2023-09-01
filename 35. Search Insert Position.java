class Solution {
    public int searchInsert(int[] nums, int target) {

    //    int arr[] = new int[nums.length+1];
 int count =0;
       for(int i=0;i<nums.length;i++){
           if(nums[i] == target){
              return i;
           }

               // 1 3 5 6   2
              
               if(nums[i] > target ){
               return count++;
               }else 
                count++;

       }
   
          return count++;

    }
}