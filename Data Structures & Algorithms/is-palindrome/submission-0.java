class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)==true){
                sb.append(Character.toLowerCase(c));
            }
        }

        if(sb.toString().equals(sb.reverse().toString())==true){
            return true;
        }

        return false;
    }
}
