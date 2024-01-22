class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        if(nums.length == 0)
            return ret;

        int start = nums[0];
        boolean flag = false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i] + 1){
                flag = true;
                continue;
            }
            else {
                if(start == nums[i])
                    ret.add("" + nums[i]);        
                else {
                    ret.add("" + start + "->" + nums[i]);
                }
                start = nums[i+1];
                flag = false;
            }
        }
        if(flag)
            ret.add("" + start + "->" + nums[nums.length-1]);
        else
            ret.add("" + nums[nums.length-1]);
        return ret;
    }
}
