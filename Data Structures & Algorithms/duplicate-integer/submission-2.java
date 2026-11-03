class Solution {
    public boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
       }
       return false;
    }
}




// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Map<Integer,Integer>mp=new HashMap<>();
//         for(int it:nums){
//             mp.put(it,mp.getOrDefault(it,0)+1);
//         }
//         for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
//             int key=entry.getKey();
//             int val=entry.getValue();
//             if(val>1){
//                 return true;
//             }
//         }
//         return false;
//     }
// }


// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Map<Integer, Integer> mp = new HashMap<>();
        
//         for (int it : nums) {
//             // If it's already in the map, we found a duplicate immediately!
//             if (mp.containsKey(it)) {
//                 return true;
//             }
//             mp.put(it, 1); // Or use getOrDefault if you still want to track counts
//         }
        
//         return false;
//     }
// }