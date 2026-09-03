class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;
        for(int i:nums1){
            if(i < minVal) {
                minVal = i;
            }
            if(i % 2 != 0) {
                hasOdd = true;
            }
        }
        if(minVal % 2 != 0) {
            return true;
        }
        return !hasOdd;
    }
}