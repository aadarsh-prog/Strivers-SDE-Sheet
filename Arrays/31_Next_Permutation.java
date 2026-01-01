class Solution {
    void rev(int [] nums,int s,int e)
    {
        
        while(s<e)
        {
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                index=i-1;
                break;
            }
        }
        if(index==-1)
        {
            rev(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>index;i--)
        {
            if(nums[i]>nums[index])
            {
                int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            rev(nums,index+1,n-1)  ;
               return;
            }
        }
        
    }
}
/*
APPROACH (Next Permutation – In-place):

1. Traverse the array from right to left to find the first index
   where nums[i] > nums[i-1].
   - This index (i-1) is called the "breakpoint".
   - It indicates where the descending order breaks.

2. If no such breakpoint is found (index == -1):
   - The array is in descending order (last permutation).
   - Reverse the entire array to get the first permutation.
   - Return.

3. From the right end of the array, find the first element
   that is greater than nums[breakpoint].

4. Swap this element with nums[breakpoint].
   - This guarantees the next larger permutation.

5. Reverse the subarray to the right of the breakpoint
   (from breakpoint + 1 to end).
   - This makes the suffix the smallest possible.

Time Complexity: O(n)
Space Complexity: O(1)
*/

