import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) 
    {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        ArrayList<int []> list=new ArrayList<>(intervals.length);
        for(int i=1;i<intervals.length;i++)
        {
            if(end>=intervals[i][0])
            end=Math.max(end,intervals[i][1]);
            else
            {
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];

            }
        }
         list.add(new int[]{start,end});

        return list.toArray(new int[list.size()][2]);
    }
}
/*
APPROACH (Merge Intervals):

1. Sort all intervals based on their start time.
   - This ensures overlapping intervals appear consecutively.

2. Initialize:
   - start and end using the first interval.
   - A list to store merged intervals.

3. Traverse remaining intervals one by one:
   a) If the current interval overlaps with the previous one
      (current.start <= end):
      - Extend the end boundary:
        end = max(end, current.end)

   b) If there is no overlap:
      - Add the previous merged interval [start, end] to the list
      - Update start and end to the current interval

4. After traversal:
   - Add the last merged interval to the list.

5. Convert the list to a 2D array and return.

Time Complexity: O(n log n)  (sorting dominates)
Space Complexity: O(n)       (output list)
*/

