// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb=new StringBuilder();
//         for(char c:s.toCharArray()){
//             if(Character.isLetterOrDigit(c)==true){
//                 sb.append(Character.toLowerCase(c));
//             }
//         }

//         if(sb.toString().equals(sb.reverse().toString())==true){
//             return true;
//         }

//         return false;
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
        int en=s.length()-1;

        while(st<en){
            while(st<en && !alphaNum(s.charAt(st))==true){
                st++;
            }
            while(st<en && !alphaNum(s.charAt(en))==true){
                en--;
            }
            if(Character.toLowerCase(s.charAt(st)) !=Character.toLowerCase(s.charAt(en))){
                return false;
            }
            st++;en--;
        }
        return true;


        
}

public boolean alphaNum(char c){
    return (c>='A' && c<='Z' ||
            c>='a' && c<='z' ||
            c>='0' && c<='9');
}

}
