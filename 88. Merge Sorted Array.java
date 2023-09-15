import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int arr[] = new int[m+n]; 
        int x =0;
        int y =0;
         for(int i=0;i<m+n;i++){          
               if (x < m && (y >= n || nums1[x] <= nums2[y])) {
                arr[i] = nums1[x];
                x++;
            } else {
                arr[i] = nums2[y];
                y++;
            }   
         }
         Arrays.sort(arr);
         for(int v=0; v<m+n;v++)
             nums1[v] = arr[v];
   
    }
}