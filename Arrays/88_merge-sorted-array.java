class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else
            nums1[k--]=nums2[j--];
        }
        while(j>=0)
        {
            nums1[k--]=nums2[j--];

        }
        
    }
}
/*
OPTIMAL APPROACH (In-place, Merge from End):

1. Use three pointers:
   - i → last valid element in nums1 (m - 1)
   - j → last element in nums2 (n - 1)
   - k → last position of nums1 (m + n - 1)

2. Compare nums1[i] and nums2[j] from the back:
   - Place the larger element at nums1[k]
   - Decrement the corresponding pointer

3. Continue until one array is exhausted.

4. If nums2 still has elements:
   - Copy them directly into nums1
   (No need to copy remaining nums1 elements,
    they are already in correct position.)

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

