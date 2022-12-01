class Solution {
    public boolean halvesAreAlike(String s) {
        ArrayList<Character> al = new ArrayList<>();
        al.add('a');    al.add('A');
        al.add('e');    al.add('E');
        al.add('i');    al.add('I');
        al.add('o');    al.add('O');
        al.add('u');    al.add('U');

        String str1=s.substring(0,s.length()/2),str2=s.substring(s.length()/2);
        ArrayList<Character> al1= new ArrayList<>();
        ArrayList<Character> al2= new ArrayList<>();
        for (Character x: str1.toCharArray()){
            if (al.contains(x)) al1.add(x);
        }
        for (Character x: str2.toCharArray()){
            if (al.contains(x)) al2.add(x);
        }
        Collections.sort(al1);
        Collections.sort(al2);

        String res1="",res2="";
        for (Character x: al1) res1+=x;
        for (Character x: al2) res2+=x;

//        System.out.println(res1+" and "+ res2);
        return res1.length()==res2.length(); 
    }
}