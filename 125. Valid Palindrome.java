 class Solution {
    public boolean isPalindrome(String s) {
        
        int x =0;
        int y= s.length()-1;

        while(x<y){
             
            char s1 = s.charAt(x);
            char e = s.charAt(y);

            if(!Character.isLetterOrDigit(s1)){
                x++;
                continue;
            }

            if(!Character.isLetterOrDigit(e)){
                y--;
                continue;
            }

            if(Character.toLowerCase(s1) != Character.toLowerCase(e))
            return false;

            x++;
            y--;

        }
          return true;
    }
 
}
