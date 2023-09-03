class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");  
        String ns= "";
        for(int i=words.length-1;i>=0;i--) {
            ns+=words[i]+" ";
        }
         return ns.trim();
    }
}