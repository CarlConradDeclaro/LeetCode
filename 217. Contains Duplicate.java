import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (uniqueSet.contains(num)) {
                return true; // Found a duplicate
            }
            uniqueSet.add(num);
        }
        return false; // No duplicates found
    }
}