Q : Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
  
//**********//
  class code
{
    int maxLen(int arr[], int n)
    {
        int ans=0 ,sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);    // if we didnt write this line then this test will fail --> arr[-1,1,-1,1]
        for(int i=0;i<n;i++)
        {
               sum+=arr[i];
               if(hm.containsKey(sum))
                    ans = Math.max(ans,i-hm.get(sum));  
               else
                  hm.put(sum,i);
        }
        return ans;
    }
}
