class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int no=target-nums[i];
            if(map.containsKey(no)){
                int idx1=map.get(no);
                int idx2=i;
                int []res={idx1, idx2};
                return res;
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}