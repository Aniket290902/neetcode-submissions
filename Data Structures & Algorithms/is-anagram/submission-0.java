class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer>mp1=new HashMap<>();
        Map<Character,Integer>mp2=new HashMap<>();

        for(char c:s.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }
        return mp1.equals(mp2);

        // for(Map.Entry<Character,Integer>it:mp.entrySet()){
        //     char key=it.getKey();
        //     int freq=it.getValue();
        // }
    }
}
