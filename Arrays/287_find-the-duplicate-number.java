class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
        slow=0;
       while(slow!=fast)
       {
         slow=nums[slow];
            fast=nums[fast];

       }
        return slow;
    }
}
/*
APPROACH (Find the Duplicate Number – Floyd’s Cycle Detection):

Key Observation:
- Numbers are in the range [1, n]
- Array size is n + 1 → at least one duplicate
- Treat the array as a linked list:
    index → node
    nums[index] → next pointer

1. Initialize two pointers:
   - slow and fast start at index 0

2. Phase 1: Detect the cycle
   - Move slow by one step: slow = nums[slow]
   - Move fast by two steps: fast = nums[nums[fast]]
   - Continue until slow and fast meet
   - A meeting point guarantees a cycle

3. Phase 2: Find the entrance of the cycle
   - Reset slow to index 0
   - Move both slow and fast one step at a time
   - The index where they meet again is the duplicate number

Why this works:
- Duplicate value creates a cycle in the index → value mapping
- Cycle entry corresponds to the repeated number

Time Complexity: O(n)
Space Complexity: O(1)
*/

