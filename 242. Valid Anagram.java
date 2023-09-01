
class Solution {
    public boolean isAnagram(String s, String t) {
        
    
      if(s.length() != t.length()) return false;


      int[] letter = new int[26];
      for(int i=0;i<s.length();i++){
            letter[s.charAt(i)-'a']++;
            letter[t.charAt(i)-'a']--;
      }

      for(int n: letter) 
        if(n != 0)
        return false;

        return true;
      

    }
}