// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String,List<String>>mpp=new HashMap<>();

//         for(String s:strs){
//             char[]arr=s.toCharArray();
//             Arrays.sort(arr);
//             String sortedS=new String(arr);
//             mpp.putIfAbsent(sortedS,new ArrayList<>());
//             mpp.get(sortedS).add(s);
//         }
//         return new ArrayList<>(mpp.values());
//     }
// }

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mpp=new HashMap<>();
        
        for(String s:strs){
           char[]arr=s.toCharArray();
           int[]count=new int[26];
           for(char c:arr){
            count[c-'a']++;
           }
           String key=Arrays.toString(count);
           mpp.putIfAbsent(key,new ArrayList<>());
           mpp.get(key).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
