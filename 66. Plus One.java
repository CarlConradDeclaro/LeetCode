import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        
         String x ="";
         for(int y:digits){
             x+=y;
         }
        BigInteger z = new BigInteger(x);
        BigInteger v = z.add(BigInteger.ONE);

         String b = String.valueOf(v);

         int[] arr = new int[b.length()];

         for(int i=0;i<arr.length;i++){
             arr[i] = b.charAt(i)-'0';
         }
     

         return arr;

    }
}