package com.example.alexandresilva.tictactoe;

/**
 * Created by alexandresilva on 2017-10-14.
 * Student ID: 100285742.
 */

public class TicTacToe {

    public enum cell { X, O, EMPTY }

    private final cell[][] board;

    private final int BOARD_SIZE = 3;

    private int moves;

    public boolean player1 = true;

    TicTacToe() {
        board = new cell[BOARD_SIZE][BOARD_SIZE];
        for (int row = 0; row < BOARD_SIZE; row++)
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = cell.EMPTY;
            }
        moves = 0;
    }

    public boolean canMove() {
        if (moves < (BOARD_SIZE * BOARD_SIZE))
            return true;
        else
            return false;
    }

    public boolean move(int row, int col) {
        if (board[row][col] == cell.EMPTY) {
            if (player1)
                board[row][col] = cell.X;
            else
                board[row][col] = cell.O;
            player1 = !player1;
            moves++;
            return true;
        }
        else
            return false;
    }

    public boolean playerWon(cell c) {
        if ( ( (board[0][0] == c) && (board[0][1] == c) && (board[0][2] == c) ) ||
                ( (board[1][0] == c) && (board[1][1] == c) && (board[1][2] == c) ) ||
                ( (board[2][0] == c) && (board[2][1] == c) && (board[2][2] == c) ) ||

                ( (board[0][0] == c) && (board[1][0] == c) && (board[2][0] == c) ) ||
                ( (board[0][1] == c) && (board[1][1] == c) && (board[2][1] == c) ) ||
                ( (board[0][2] == c) && (board[1][2] == c) && (board[2][2] == c) ) ||

                ( (board[0][0] == c) && (board[1][1] == c) && (board[2][2] == c) ) ||
                ( (board[0][2] == c) && (board[1][1] == c) && (board[2][0] == c) ) ) {
            return true;
        }
        else
            return false;
    }

}
