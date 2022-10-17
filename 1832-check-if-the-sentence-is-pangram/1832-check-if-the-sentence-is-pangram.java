class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] s = sentence.toCharArray();
HashSet hm=new HashSet();
for(int i=0;i<s.length;i++)
{
hm.add(s[i]);
}
if(hm.size()==26)
{
return true;
}
else
return false;
    }
}