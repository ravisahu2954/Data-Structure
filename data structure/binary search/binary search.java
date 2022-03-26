Question link : https://leetcode.com/problems/binary-search/

Solution:
class Solution {
    public int search(int[] nums, int target) {
        
       int l=0 , h= nums.length;
         while(l<h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]>target)
                h=mid;
            else if(nums[mid]<target)
                l=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
