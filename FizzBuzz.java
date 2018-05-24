public class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> ret = new ArrayList<String>(n);
        if(n==1)
        {
            ret.add(String.valueOf(n));
            return ret; 
        }
        else
        {
        
        for(int i=0;i<n;i++)
        {
            if((i+1)%3==0&&(i+1)%5==0)
              {
                ret.add("FizzBuzz");  
              }
            else if((i+1)%3==0)
            {
                ret.add("Fizz");
                
            }
            else if((i+1)%5==0)
            {
                ret.add("Buzz");
                
              }
              
            else
            {
                ret.add(String.valueOf(i+1));
            }
        }
        return ret;
        }   
    }
}