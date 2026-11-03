class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int it:nums){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val>1){
                return true;
            }
        }
        return false;
    }
}