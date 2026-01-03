class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length  ;
      
     //transpose the matrix
      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
          int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        }
      }
      //reverse the rows
      for(int i=0;i<n;i++)
      {
        for(int left=0,right=n-1;left<right;left++,right--)
        {
            int t=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=t;
        }
      }
    }
}
/*
APPROACH (Rotate Image 90° Clockwise – In-place):

1. Transpose the matrix:
   - Convert rows into columns by swapping matrix[i][j]
     with matrix[j][i] for j >= i
   - This reflects the matrix across its main diagonal

2. Reverse each row:
   - Swap elements from left to right within every row
   - This converts the transposed matrix into a 90° clockwise rotation

Why this works:
- Transpose + Row Reversal = 90° clockwise rotation
- No extra matrix is required

Time Complexity: O(n²)
Space Complexity: O(1)
*/

