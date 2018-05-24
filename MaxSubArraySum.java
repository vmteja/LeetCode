class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar=nums[0];
        int maxoverall=nums[0];
        
        for(int i=1;i<nums.length;++i)
        {
            
            maxsofar = Math.max(nums[i], maxsofar+ nums[i]);
            maxoverall = Math.max(maxsofar,maxoverall);
        }
        return maxoverall;
        
    }
}