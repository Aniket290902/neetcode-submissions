// class Solution {
//     public boolean isAnagram(String s, String t) {

//         Map<Character,Integer>mp1=new HashMap<>();
//         Map<Character,Integer>mp2=new HashMap<>();

//         for(char c:s.toCharArray()){
//             mp1.put(c,mp1.getOrDefault(c,0)+1);
//         }
//         for(char c:t.toCharArray()){
//             mp2.put(c,mp2.getOrDefault(c,0)+1);
//         }
//         return mp1.equals(mp2);

        
//     }
// }


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    Map<Character,Integer>mp1=new HashMap<>();
       for(char c:s.toCharArray()){
        mp1.put(c,mp1.getOrDefault(c,0)+1);
       }

       for(char c:t.toCharArray()){
        if(mp1.containsKey(c)==false || mp1.get(c)==0){
            return false;
        }
        mp1.put(c,mp1.get(c)-1);
       }
       return true;
        
    }
}
