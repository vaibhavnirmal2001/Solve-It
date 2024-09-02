class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while (true){
            if (k<chalk[i]) return i;
            if (chalk[i]<=k){
                k=k-chalk[i];
            }
            if (i==chalk.length-1) i=0;
            else i++;
        }
    }
}