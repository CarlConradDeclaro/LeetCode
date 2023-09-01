  
class Solution {
   public String addBinary(String a, String b) {
    StringBuilder r1 = new StringBuilder(a).reverse();
    StringBuilder r2 = new StringBuilder(b).reverse();
    
    int carry = 0;
    int n = Math.max(a.length(), b.length());
    String bi = "";
   
    for (int i = 0; i < n; i++) {
        int x1 = (i < r1.length()) ? Integer.valueOf(r1.charAt(i) - '0') : 0;
        int x2 = (i < r2.length()) ? Integer.valueOf(r2.charAt(i) - '0') : 0;
        
        int sum = x1 + x2 + carry;
        
        if (sum == 2) {
            bi += "0";
            carry = 1;
        } else if (sum > 2) {
            bi += "1";
            carry = 1;
        } else if (sum == 1) {
            bi += "1";
            carry = 0;
        } else if (sum == 0) {
            bi += "0";
            carry = 0;
        }
    }
    
    if (carry == 1) {
        String binary = bi + "1";
        StringBuilder r = new StringBuilder(binary).reverse();
        return r.toString();
    } else {
        StringBuilder r = new StringBuilder(bi).reverse();
        return r.toString();
    }
}

}