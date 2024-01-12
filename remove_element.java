class Solution {
    public int removeElement(int[] nums, int val) {
        int tmp = 0;
        boolean flag = false;
        int i = 0;
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            } else {
                return 1;
            }
        }
        for(i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                if(i == nums.length - 1){
                    break;
                }
                flag = false;
                for(int j = i + 1; j< nums.length; j++){
                    if(nums[j] != val) {
                        tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                    break;
            }
        }
        return i; 
    }
}
