class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>st = new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int mult = k;
        while(st.contains(mult)) {
            mult += k;
        }
        return mult;
    }
}