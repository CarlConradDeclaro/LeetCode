import java.util.*;


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestCandies = new ArrayList<>();
        
        int g = candies[0];
        for(int x : candies)
            if(g < x)
            g = x;
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= g)
            greatestCandies.add(true);
            else
             greatestCandies.add(false); 
        }
    return greatestCandies;
    }
}
