class Solution {
    public void setZeroes(int[][] a) {
      int[] temp1=new int[a.length];
        int[] temp2=new int[a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    temp1[i]=1;
                    temp2[j]=1;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[0].length;j++){
                if(temp1[i]==1||temp2[j]==1){
                    a[i][j]=0;
                }
            }
        }  
    }
}