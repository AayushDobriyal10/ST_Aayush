package Week_4.Day4;

public class RatInAMaze {
    static int[][] sol = new int[100][100];

    static void display(int n, int m) { // n is rows and m is column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean RatIAM(char[][] maze, int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            sol[i][j]=1;
            display(n, m);
            return true;
        }
        if (i >= 0 && i < n && j >= 0 && j < m && maze[i][j] != 'X' && sol[i][j]==0) {
            sol[i][j] = 1;
            RatIAM(maze , i , j+1,n,m); //right
            RatIAM(maze , i+1 , j,n,m); // down
            RatIAM(maze , i , j-1,n,m); // left
            RatIAM(maze , i-1 , j,n,m); // up 
            // for backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] maze = {
                { '0', 'X', '0', '0', '0' },
                { '0', 'X', '0', 'X', '0' },
                { '0', 'X', '0', 'X', '0' },
                { '0', 'X', '0', 'X', '0' },
                { '0', '0', '0', 'X', '0' },
        };
        char[][] maze2 = {
                { '0', '0', '0', '0', '0' },
                { '0', 'X', '0', 'X', '0' },
                { '0', 'X', '0', 'X', '0' },
                { '0', 'X', '0', 'X', '0' },
                { '0', '0', '0', 'X', '0' },
        };
        RatIAM(maze, 0, 0, 5, 5);
        RatIAM(maze2, 0, 0, 5, 5);
    }
}
