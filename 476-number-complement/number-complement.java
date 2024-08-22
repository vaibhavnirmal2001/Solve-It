class Solution {
    public static int findComplement(int num) {
        String binaryString=Integer.toBinaryString(num);
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i)=='0'){
                res.append('1');
            }else {
                res.append('0');
            }
        }
        return Integer.parseInt(res.toString(),2);
    }
}