class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0; 
        int xor = start ^ goal; // XOR will give 1 where the bits differ

        while(xor!=0){
            count += xor & 1; // Increment count if the last bit is 1
            xor >>=1; // Right-shift to check the next bit
        }
        return count;
    }
}