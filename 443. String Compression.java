import java.util.List;
class Solution {
    public int compress(char[] chars) {

      StringBuilder result = new StringBuilder();
      
        int count =1;
        char arr = chars[0];
        for(int i=1;i<chars.length;i++)  
            if(arr == chars[i])
               count++;
            else{
                if(count >1)
                result.append(arr).append(count);
                else
                result.append(arr);
                
                arr = chars[i];
                count =1;       
            }         
    
         if(count >1)
            result.append(arr).append(count);
          else
            result.append(arr);
        
        String r = result.toString();
        for(int c =0; c<r.length(); c++)
            chars[c] = r.charAt(c);

        return result.toString().length();
    }
}