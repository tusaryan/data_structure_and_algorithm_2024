package org.example.backtracking;

public class RatInAMaze {

    public static void ratInAMaze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        printAllPath(maze, 0, 0, path);
//        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        //Check if i, j is valid or not
        //Note we are checking maze as valid only after checking whether it is a valid cell or not, else we will get Error: out of bounds
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        //Include the cell in current path
        path[i][j] = 1;

        //Destination cell
        if (i == n - 1 && j == n - 1) {
            for (int row = 0; row < path.length; row++) {
                for (int col = 0; col < path.length; col++) {
                    System.out.print(path[row][col] + " ");
                }
                System.out.println();
            }
            return true;
        }

        //Explore further in all directions
        // Move Top
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        //Move Right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }

        //Move Down
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        //Move Left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
    }

    public static void printAllPath(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        //Check if i, j is valid or not
        //Note we are checking maze as valid only after checking whether it is a valid cell or not, else we will get Error: out of bounds
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        //Include the cell in current path
        path[i][j] = 1;

        //Destination cell
        if (i == n - 1 && j == n - 1) {
            for (int row = 0; row < path.length; row++) {
                for (int col = 0; col < path.length; col++) {
                    System.out.print(path[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
            // Reset destination to zero before going back to find new path
            path[i][j] = 0;
            return;
        }

        //Explore further in all directions
        // Move Top
        printAllPath(maze, i - 1, j, path);

        //Move Right
        printAllPath(maze, i, j + 1, path);

        //Move Down
        printAllPath(maze, i + 1, j, path);

        //Move Left
        printAllPath(maze, i, j - 1, path);
        //Reset current path position to zero before going back find new path
        path[i][j] = 0;
    }


    public static void main(String[] args) {
        int[][] maze = {{1,1,0}, {1,1,0}, {1,1,1}};
//        boolean pathPossible = ratInAMaze(maze);
//        System.out.println(pathPossible);
        ratInAMaze(maze);
    }
}
