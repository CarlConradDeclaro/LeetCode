class Solution {
    public String mergeAlternately(String word1, String word2) {
    
    int n = Math.min(word1.length(),word2.length());

    StringBuilder s =  new StringBuilder();
   
      for(int i=0; i<n;i++){
        s.append(word1.charAt(i)).append(word2.charAt(i));          
      }
        s.append(word1.substring(n)).append(word2.substring(n));
 
      return s.toString();

    }
}
