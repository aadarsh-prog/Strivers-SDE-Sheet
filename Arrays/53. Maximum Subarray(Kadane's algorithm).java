class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxSum=nums[0];
        int curSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curSum=Math.max(curSum+nums[i],nums[i]);
            maxSum=Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
/*
APPROACH (Kadane’s Algorithm – Maximum Subarray Sum):

1. Initialize:
   - curSum as the maximum subarray sum ending at the current index
   - maxSum as the maximum subarray sum found so far
   (Both start with nums[0] to handle all-negative arrays)

2. Traverse the array from index 1 onward:
   - For each element, decide:
       a) Extend the previous subarray (curSum + nums[i])
       b) Start a new subarray from current element (nums[i])
   - Choose the maximum of the two for curSum

3. Update maxSum at each step:
   - maxSum = max(maxSum, curSum)

4. After traversal, maxSum contains the maximum subarray sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

