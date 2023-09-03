 class Solution {
    public void moveZeroes(int[] nums) {
        
       int arr[] = new int[nums.length]; 
    
        int x =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[x] = nums[i];
                x++;
            }
        }
    
          for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

    }
}   
