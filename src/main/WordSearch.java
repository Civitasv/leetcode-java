package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * <p>
 * The same letter cell may not be used more than once.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean exist = false;
        char[] chars = word.toCharArray();
        int row = board.length, col = board[0].length;

        List<Integer> ids = findStartIds(board, chars[0]);
        for (int i = 0; i < ids.size(); i++) {
            for (int j = 0; j < chars.length; j++) {
                char t = chars[j];
                int r = i / row, c = i - r * row;
                
            }
        }
        return exist;
    }


    private List<Integer> findStartIds(char[][] board, char start) {
        List<Integer> res = new ArrayList<>();
        int row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (board[i][j] == start) res.add(i * row + j);
        return res;
    }
}
