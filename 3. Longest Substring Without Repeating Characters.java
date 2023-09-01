 import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

   if(s.length() == 0 )
    return 0;
     if(s.length() == 1 )
    return 1;
      
          
    LinkedList<String> list = new LinkedList<>();
    String sentence = s;
    for(int i=0;i<sentence.length();i++){
        char c = sentence.charAt(i);
        String newS= c+"";
        
         for(int j=i+1;j<sentence.length();j++){
    
          if(!(newS.contains(String.valueOf(sentence.charAt(j))))){
              newS+=sentence.charAt(j);
          }else{
                list.add(newS);
                break;
            }
            
             if (j == sentence.length() - 1) {
                    list.add(newS);
                }
            
        }
    }
     String longSubs = list.get(0);
     for (String value : list) {
           if(longSubs.length()< value.length())
            longSubs =value;
            }

       return longSubs.length();
    }
}