class Solution {
    public static int findComplement(int num) {
        return Integer.parseInt(Integer.toBinaryString(num).replace('0', '2').replace('1', '0').replace('2', '1'), 2);
    }
}