Question link : https://www.interviewbit.com/problems/implement-strstr/

Solution:

public int strStr(final String A, final String B) {
       
        if(A.length()<B.length())
         return -1;
       int len = B.length();  
      
    int bsize=0 ,fwindow=0;
       for(int i=0;i<len;i++)
       {
            bsize+=B.charAt(i)-'a';
            fwindow+=A.charAt(i)-'a';   
       }
     int ans=-1,i=0;
        for(int j=0;j<=A.length()-len;j++,i++)
        {

             if(fwindow==bsize)
             {
               ans=checkforans(A.substring(j,len+j),B,j);
               if(ans!=-1)
                return ans;
             }
             else
             {
               fwindow-=(A.charAt(i)-'a');
              if(j+len<A.length())
               fwindow+=(A.charAt(j+len)-'a');
        
             }
             
        }
        return ans;
    }
    private int checkforans(String A,String B,int j)
    {
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=B.charAt(i))
               return -1;
        }
        return j;
    }
