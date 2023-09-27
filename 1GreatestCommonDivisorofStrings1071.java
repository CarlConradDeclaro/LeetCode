
public class 1071GreatestCommonDivisorofStrings
{
    
    static String gcd(String word1,String word2){
    
     if(word1.equals(word2))
       return word1;
    
    
     if(word2.length() > word1.length())
       return gcd(word2,word1);
     
     if(word1.startsWith(word2))
       return gcd(word1.substring(word2.length()),word2 );
   
     
     return "";
    }
	public static void main(String[] args) {
	 
	 String word1 = "ABCABCABC";
	 String word2 = "ABCABC";
	 
	 System.out.println(gcd(word1,word2));
	 
	 
	}
}
