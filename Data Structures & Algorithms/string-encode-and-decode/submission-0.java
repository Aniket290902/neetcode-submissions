class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
            List<Integer>list=new ArrayList<>();
            StringBuilder sb=new StringBuilder();
            for(String s:strs){
                list.add(s.length());
            }

            for(int it:list){
                sb.append(it).append(',');
            }
            sb.append('#');
            for(String s:strs){
                sb.append(s);
            }
            return sb.toString(); // "4,4,#neetcode" //

    }

    public List<String> decode(String str) {

        if(str.isEmpty()){
            return new ArrayList<>();
        }
        List<String>res=new ArrayList<>();
        List<Integer>sizes=new ArrayList<>();

        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder curr=new StringBuilder();
            while(str.charAt(i)!=','){
                curr.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }
        i++;

        for(int sz:sizes){
            res.add(str.substring(i,i+sz));
            i=i+sz;
        }
        return res;

        


        

    }
}
