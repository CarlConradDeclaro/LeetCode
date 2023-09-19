import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                HashMap<Integer, List<String>> hash = new HashMap<>();
                int key = 0; 
                
                for(int i = 0; i < strs.length; i++) {
                    String word1 = strs[i];
                    String letters[] = word1.split("");
                    Arrays.sort(letters);
                    
                    ArrayList<String> sameWord = new ArrayList<>();
                    if(strs[i] != "0"){
                        for(int j = i ; j < strs.length; j++) {
                            String word2 = strs[j];
                            String letters2[] = word2.split("");
                            Arrays.sort(letters2);
            
                            if(Arrays.equals(letters, letters2)) {
                                sameWord.add(word2);
                                strs[j] = "0";
                            }
                        }
                        hash.put(key, sameWord);
                        key++; 
                }                
            }
            List<List<String>> anagramGroups = new ArrayList<>();
            for(Map.Entry<Integer,List<String>> angrams : hash.entrySet() ){
                anagramGroups.add(angrams.getValue());
            }        
        return anagramGroups;
    }
}