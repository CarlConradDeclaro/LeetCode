import java.util.*;
class Solution {
    public String reverseVowels(String s) {
         List<String> vowels = new ArrayList<>();
            vowels.add("a");
            vowels.add("e");
            vowels.add("i");
            vowels.add("o");
            vowels.add("u");
            vowels.add("A");
            vowels.add("E");
            vowels.add("I");
            vowels.add("O");
            vowels.add("U");
        
        int n = s.length()-1;
       
        String[] subs = s.split("");
         String v = "";
        for(int i=s.length()-1;i>=0;i--){
              if(vowels.contains(subs[i])){
              v+=subs[i];
              subs[i] = "0";
              }
        } 
         int counter=0;
         for(int i=0;i<s.length();i++){
             if(subs[i] == "0"){
                 subs[i] = v.charAt(counter)+"";
                 counter++;
             }
        }
         return String.join("", subs);
    }
}