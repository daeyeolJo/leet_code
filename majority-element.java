class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                if(cnt > nums.length / 2){
                    return nums[i];
                } else {
                    cnt = 1;
                }
            } else {
                cnt++;
                if(i == nums.length - 2 && cnt > nums.length / 2){
                    return nums[i];
                }
            }
        }

        return nums[0];
    }
}
