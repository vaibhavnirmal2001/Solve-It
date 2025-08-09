class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;

        while(n != 1)
        {
            if(n % 2 == 0)
                n/=2;
            else 
                break;
        }

        return n == 1;
    }
}

// 2-> 1 -> 2
// 2-> 2 -> 4
// 2-> 3 -> 8
// 2-> 4 -> 16
// 2-> 5 -> 32