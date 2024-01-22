class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> idxArray = map.get(nums[i]);
                int lastIdx = idxArray.get(idxArray.size()-1);
                if(i - lastIdx <= k)
                    return true;
                else {
                    idxArray.add(i);
                }
            } else {
                ArrayList<Integer> idxArray = new ArrayList<>();
                idxArray.add(i);
                map.put(nums[i], idxArray);
            }
        }
        return false;
    }
}
