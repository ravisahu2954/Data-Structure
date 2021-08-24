// tabulation form

 public int countSubstrings(String s) {
 
    boolean b[][] = new boolean[s.length()][s.length()];   
    int count=0;
    for(int g=0; g<s.length(); g++)
    {
        for(int i=0 , j=g ; j<s.length(); i++ , j++)
        {
            if(g==0)
                b[i][j]=true;
            else if(g==1)
            {
                if(s.charAt(i)==s.charAt(j))
                    b[i][j]=true;
                else
                    b[i][j]=false;
            }
            else
            {
                if(s.charAt(i)== s.charAt(j) && b[i+1][j-1])
                    b[i][j]=true;
                else
                    b[i][j]=false;
            }
            
             if(b[i][j]==true)
                 count++;
        }
    }
        return count;
  }
