QUESTION LINK : https://leetcode.com/problems/set-matrix-zeroes/
  
SOLUTION 1 :

class Solution {
    public void setZeroes(int[][] matrix) {
        
        
      int  []row= new int[matrix.length];
      int  []col= new int[matrix[0].length];  
      
     for(int i=0;i<matrix.length ;i++)
      {
          
          for(int j=0; j <matrix[0].length;j++)
          {
              
              if(matrix[i][j]==0)
              {
                  row[i]=-1;
                  col[j]=-1;
              }
              
          }
       }
       for(int i=0;i<matrix.length;i++)
       {
           if(row[i]==-1)
           {
               
               for(int k=0 ; k<matrix[0].length ;k++ )
                   matrix[i][k]=0;
            }
       }
        for(int i=0;i<matrix[0].length;i++)
       {
           if(col[i]==-1)
           {
               
               for(int k=0 ; k<matrix.length ;k++ )
                   matrix[k][i]=0;
            }
       }
        
        
    }
}
