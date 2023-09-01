class Solution {
    public int climbStairs(int n) {

// 1, 1, 2, 3, 5, 8, 13
     
      int x=0,y=1;
      int v =0;
      int c = 0;
     
      for(int i=0;i<=n;i++){
         int temp=x; 
         v = x+y;
         y=temp;
         x=v;
       
          
      }
     return v;


    }
}