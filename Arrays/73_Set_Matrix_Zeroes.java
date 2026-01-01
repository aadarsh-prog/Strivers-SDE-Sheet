class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean isFirstRowImpected=false;
        boolean isFirstColImpected=false;
        //checking if first row is impected
        for(int i=0;i<n;i++)
        {
            if(matrix[0][i]==0)
            {
                isFirstRowImpected=true;
                break;
            }
        }
        //checking if first column is impected
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                isFirstColImpected=true;
                break;
            }
        }
        //set markers in first row and  column
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
        {
            if(matrix[i][j]==0)
            {
                matrix[0][j]=0;
                matrix[i][0]=0;
            }
        
        }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if( matrix[0][j]==0||matrix[i][0]==0)
                 matrix[i][j]=0;
            }
        }
        if(isFirstRowImpected)
        {
             for(int i=0;i<n;i++)
               matrix[0][i]=0;
        }
        if(isFirstColImpected)
        {
             for(int i=0;i<m;i++)
               matrix[i][0]=0;
        }
    }
}
/*
APPROACH (In-place, O(1) extra space):

1. Use the first row and first column as marker storage
   - If matrix[i][j] == 0, mark:
       matrix[0][j] = 0  → column j should be zero
       matrix[i][0] = 0  → row i should be zero

2. Before using them as markers, check:
   - Whether the first row originally contains any zero
   - Whether the first column originally contains any zero
   (Store this information using two boolean flags)

3. Traverse the matrix from index (1,1):
   - For every zero found, mark its row and column
     using the first row and first column

4. Traverse the matrix again (excluding first row & column):
   - If row marker or column marker is zero,
     set the current cell to zero

5. Finally:
   - If the first row was originally impacted, set entire first row to zero
   - If the first column was originally impacted, set entire first column to zero

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

