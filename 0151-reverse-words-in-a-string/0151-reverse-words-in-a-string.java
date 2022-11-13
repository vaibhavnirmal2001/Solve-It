class Solution {
   public static String reverseWords(String s) {
        s=s.trim().replaceAll(" +", " ");
        ArrayList<String> al = new ArrayList<>();

        StringBuilder temp= new StringBuilder();

        for (Character c: s.toCharArray()){
            if (c==' ') {
                al.add(temp.toString());
                temp = new StringBuilder();
            }
            else {
                temp.append(c);
            }
        }
        al.add(String.valueOf(temp));
        Collections.reverse(al);
//        System.out.println(al);
        String ans="";
        for (int i = 0; i < al.size(); i++) {
            if (i==al.size()-1){
                ans+=al.get(i);
                break;
            }
            if (i<al.size()-1){
                ans+=al.get(i)+" ";
            }
        }
        return ans;
    }
}