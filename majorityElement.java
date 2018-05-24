class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int k=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==null)
            {
                hm.put(nums[i],1);
            }
            else
            {
                k = hm.get(nums[i]);
                hm.put(nums[i],++k);
            }
            
         }
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])>(nums.length)/2)
            {
                return nums[i];
            }
        }
        return -1;
        
    }
}