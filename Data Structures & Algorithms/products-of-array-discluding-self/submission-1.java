// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         List<Integer>lst=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             int pdt=1;
//             for(int j=0;j<nums.length;j++){
//                 if(i==j){
//                     continue;
//                 }
//                 else{
//                     pdt=pdt*nums[j];
//                 }
//             }
//                 lst.add(pdt);

//         }

//         int[]res=lst.stream()
//                     .mapToInt(i->i)
//                     .toArray();

//                     return res;
//     }
// }  







class Solution {
    public int[] productExceptSelf(int[] nums) {

        List<Integer>lst=new ArrayList<>();
        int pdt=1;
        int zer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                pdt=pdt*nums[i];
            }
            else{
                zer++;
            }
            
        }
        if(zer>1){
            return new int[nums.length];
        }

        for(int i=0;i<nums.length;i++){
            if(zer>0){
               lst.add(nums[i]==0?pdt:0) ;
            }
            else{ lst.add(pdt/nums[i]);}
           
        }


        
        int[]res=lst.stream()
                    .mapToInt(i->i)
                    .toArray();

        return res;
    }
}  
