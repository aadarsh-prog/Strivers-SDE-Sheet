class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,i=0;
        while(i<=right)
        {
            if(nums[i]==0)
            {
                int t=nums[i];
                nums[i]=nums[left];
                nums[left]=t;
                i++;
                left++;
            }
            else if(nums[i]==2)
            {
                int t=nums[i];
                nums[i]=nums[right];
                nums[right]=t;
               
                right--;
            }
            else
            i++;
        }
        
    }
}
/*
APPROACH (Dutch National Flag Algorithm):

1. Use three pointers:
   - left  → position for next 0
   - right → position for next 2
   - i     → current index being processed

2. Traverse the array while i <= right:
   a) If nums[i] == 0:
      - Swap nums[i] with nums[left]
      - Increment both i and left
      (0 is placed in its correct position)

   b) If nums[i] == 2:
      - Swap nums[i] with nums[right]
      - Decrement right
      - Do NOT increment i, because the swapped element
        from the right is not yet processed

   c) If nums[i] == 1:
      - Just move forward (i++)

3. Loop ends when all elements are partitioned as:
   - [0 ... left-1]   → 0s
   - [left ... right] → 1s
   - [right+1 ... n-1]→ 2s

Time Complexity: O(n)
Space Complexity: O(1)
*/

