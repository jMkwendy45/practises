package HackerRank;

import java.util.Scanner;

public class TicTac {
    static Scanner sc = new Scanner(System.in);
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    static char player = 'X';
    public static void main(String[] args) {
        while (true) {
            System.out.println("Current board:");
            printBoard();
            System.out.println("Player " + player + ", enter your move (row[1-3] column[1-3]):");
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            if (board[row][col] == ' ') {
                board[row][col] = player;
                if (hasWon(player)) {
                    System.out.println("Player " + player + " has won!");
                    printBoard();
                    break;
                } else if (isDraw()) {
                    System.out.println("It's a draw!");
                    printBoard();
                    break;
                }
                player = (player == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Move already made at that position, try again");
            }
        }
    }

    public static boolean hasWon(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i != 2) {
                System.out.println("---|---|---");
            }
        }

    }
}
