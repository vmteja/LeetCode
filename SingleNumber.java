class Solution {
    public int singleNumber(int[] nums) {
        Integer c,i;
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        
        for(i=0;i<nums.length;i++)
        {
            c = hm.get(nums[i]);
           
        if(c == null)
        {
            hm.put(nums[i],1);
        }
        else
        {
            hm.put(nums[i],++c);
        }
       
    }
        for(i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==1)
            {
                return nums[i];
            }
         
}
        return -1;
}
}