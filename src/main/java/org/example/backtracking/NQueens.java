package org.example.backtracking;

public class NQueens {
    public static void placeNQueens(int n) {
        int[][] board = new int[n][n];
        placeQueens(board, 0, n);
    }

    private static void placeQueens(int[][] board,int n, int row) {
        if (row == n) {
            //Valid board configuration
            // reset cell to zero after placing the queen in final row when backtracking
            // so that it is available for new fresh configuration
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(board[i][j] + " ");
                }
            }
            System.out.println();
        }

        //Check for all columns
            // Check if its safe to place Queen
                //If its safe -> then place the Queen, mark that point as 1 and move to next row
                // reset cell to zero after placing the queen when backtracking
        for(int j = 0; j < n; j++) {
            if(isBoardSafe(board, row, j)) {
                board[row][j] = 1;
                placeQueens(board, n, row + 1);
                board[row][j] = 0;
            }
        }
    }

    private static boolean isBoardSafe(int[][] board, int row, int col) {
        int n = board.length;
        for (int i = row - 1, j = col - 1; i>=0 && j >= 0; i--, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j >= 0; i--, j++) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row + 1; i < n; i++) {
            if(board[i][col] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        placeNQueens(5);
    }
}
