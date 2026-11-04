// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[][]arr=new int[nums.length][2];
//         for(int i=0;i<nums.length;i++){
//             arr[i][0]=nums[i];
//             arr[i][1]=i;
//         }

//         Arrays.sort(arr,Comparator.comparingInt(a->a[0])); 


//         int i=0;
//         int j=nums.length-1;
//         while(i!=j && i<j){
//             int curr=arr[i][0]+arr[j][0];

//             if(curr==target){
//                 return new int[]{Math.min(arr[i][1],arr[j][1]),
//                 Math.max(arr[i][1],arr[j][1])
//                 };
//             }
//             else if(curr>target)
//             {
//                 j--;
//             }
//             else if(curr<target){
//                 i++;
//             }
//         }
//         return new int[]{};
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//            Map<Integer,Integer>mpp=new HashMap<>();
//            for(int i=0;i<nums.length;i++){
//             mpp.put(nums[i],i);
//            }

//            for(int i=0;i<nums.length;i++){
//             int rem=target-nums[i];
//             if(mpp.containsKey(rem)==true && i<mpp.get(rem)){
//                 return new int[]{i,mpp.get(rem)};
//             }
//            }

//            return new int[]{};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
           Map<Integer,Integer>mpp=new HashMap<>();
           for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            int num=nums[i];

            if(mpp.containsKey(rem)==true){
                return new int[]{mpp.get(rem),i};
            }
            mpp.put(num,i);
           }

           

           return new int[]{};
    }
}
