class Solution {
    public static int findComplement(int num) {
        String binaryString=Integer.toBinaryString(num);
        StringBuilder res= new StringBuilder();
        for(char c: binaryString.toCharArray()) res.append(c=='0'?'1':'0');
        return Integer.parseInt(res.toString(),2);
    }
}