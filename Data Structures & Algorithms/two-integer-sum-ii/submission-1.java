// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int mini=Integer.MAX_VALUE;
//         int maxi=Integer.MIN_VALUE;

//         for(int i=0;i<numbers.length-1;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     return new int[]{i+1,j+1};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }



class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;

        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
        }
        return new int[]{};
    }
}
