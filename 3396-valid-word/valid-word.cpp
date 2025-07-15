class Solution {
public:

    bool isVol(char letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        return true;
        return false;
    }
    bool isValid(string word) {
        if(word.size() < 3)
        return false;
        int count_v = 0;
        int count_c = 0;
        for(int i=0; i<word.size(); i++){
            if(!isalnum(word[i])) return false;
            if(isalpha(word[i])){
                if(isVol(word[i]))
                count_v++;
                else
                count_c++;
            }
        }
        if(!count_v || !count_c)
        return false;
        return true;
    }
};