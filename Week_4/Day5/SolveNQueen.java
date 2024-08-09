package Week_4.Day5;

public class SolveNQueen {
    static boolean check(int[][] board, int i, int j, int n) {
        // check vertical and horizontal
        for (int x = 0; x < n; x++) {
            if (board[x][j] == 1 || board[i][x] == 1)
                return false;
        }
        // check diagonal
        // left diagonal
        int x = i, y = j;
        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1)
                return false;
            x--;
            y--;
        }
        // right diagonal
        while (i >= 0 && j < n) {
            if (board[i][j] == 1)
                return false;
            i--;
            j++;
        }
        return true;
    }

    static boolean nQueen(int[][] board, int i, int n) {
        // base case
        if (i == n) {
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(board[x][y] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return true; // return false for all possible combinations
        }
        for (int j = 0; j < n; j++) {
            if (check(board, i, j, n)) {
                board[i][j] = 1;
                if (nQueen(board, i + 1, n))
                    return true;
                board[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];
        nQueen(board, 0, n);
    }
}