 class Solution {
    public boolean isPalindrome(int x) {
        
       String palidrome = Integer.toString(x);
       StringBuilder reverse = new StringBuilder(String.valueOf(x)).reverse();

       return palidrome.equals() ? true:false;
   


    }
}