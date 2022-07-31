link: https://leetcode.com/problems/range-sum-query-mutable/

class NumArray {
    
    int segment_tree[] ;
    int nums[];
    int n;
   
    public NumArray(int[] nums) {
      
        n = nums.length;
        this.nums = nums;
        segment_tree = new int[4*n];
        building_sgm(0,n-1,0);
   
    }
  
    public void update(int index, int val) {
         
         doUpdate(0,n-1,index,val-nums[index],0);
         nums[index]=val;
      
    }
    
    public int sumRange(int left, int right) {
      
         return getSum(0,n-1,left,right,0);
    
    }
    private int building_sgm(int s,int e,int i)
    {
        
        if(s==e)
        {
            segment_tree[i]=nums[s];
            return nums[s];
        }
     
        int mid = s+(e-s)/2;
        segment_tree[i] =building_sgm(s,mid,2*i+1)+building_sgm(mid+1,e,2*i+2);
        return segment_tree[i];
        
    }
    private int getSum(int s,int e,int left,int right,int i)
    {
        if(s>=left && e<=right)
        {
            return segment_tree[i];
        }
        if(e<left || s>right)
            return 0;
        int mid = s+(e-s)/2;
        return getSum(s,mid,left,right,2*i+1)+getSum(mid+1,e,left,right,2*i+2);
        
    }
    private void doUpdate(int s,int e,int index,int diff,int si)
    {
        if(s>index || e<index)
            return ;
        
        segment_tree[si] = segment_tree[si]+diff;
        if(s!=e)
        {
           int mid = s+(e-s)/2;
           doUpdate(s,mid,index,diff,2*si+1);
           doUpdate(mid+1,e,index,diff,2*si+2);
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
