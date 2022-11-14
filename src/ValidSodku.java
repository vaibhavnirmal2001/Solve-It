import java.util.*;

public class ValidSodku {
    public boolean isValidSudoku(char[][] board) {
        Set s = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!s.add(b + i) || !s.add(j + b) || !s.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
