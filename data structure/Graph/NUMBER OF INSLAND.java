QUESTION LINK : https://leetcode.com/problems/number-of-islands/

///******************///

class Solution {
    public int numIslands(char[][] grid) {
        int count=0; 
        int row = grid.length , col = grid[0].length;
        boolean b[][] = new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1' && !b[i][j])
                {
                    island(i,j,grid,b);
                    count++;
                }
            }
        }
        return count;
    }
    private void island(int i,int j,char [][] grid , boolean[][]b)
    {
       if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||  grid[i][j]=='0' || b[i][j]==true)
           return ;
       b[i][j] = true;  
       island(i,j+1,grid,b);
       island(i+1,j,grid,b);
       island(i,j-1,grid,b);
       island(i-1,j,grid,b);
    }
}
