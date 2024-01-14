class Solution {
    public int removeDuplicates(int[] nums) {
        int nowValue = nums[0];
        int currIdx = 1;
        int compIdx = currIdx;
        while(currIdx < nums.length){
            boolean check = false;
            for(int j=compIdx; j < nums.length; j++){
                if(nums[j] > nowValue){
                    nums[currIdx] = nums[j];
                    nowValue = nums[currIdx];
                    compIdx = j;
                    check = true;
                    break;
                }
            }
            if(!check)
                break;
            currIdx++;
        }
        return currIdx;
    }
}
