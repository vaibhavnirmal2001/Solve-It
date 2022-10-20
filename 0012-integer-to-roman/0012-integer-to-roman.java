class Solution {
    public String intToRoman(int num) {	 

	    int[] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
        String[] str = {"M", "CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i<intCode.length; i++){
            while(num >= intCode[i]){
                str2.append(str[i]);
                num -= intCode[i];
            }
        }
        
        return str2.toString();
    }
}