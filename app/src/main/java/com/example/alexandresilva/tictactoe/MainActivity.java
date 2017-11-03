package com.example.alexandresilva.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MainActivity extends AppCompatActivity
    implements OnClickListener {

    private Button button11;
    private Button button12;
    private Button button13;

    private Button button21;
    private Button button22;
    private Button button23;

    private Button button31;
    private Button button32;
    private Button button33;

    private Button btnNewGame;

    private TextView textWarning;

    private TicTacToe game = null;

    // define the SharedPreferences object
    private SharedPreferences savedValues;

    // define instance variables that should be saved
    private String board11 = "";
    private String board12 = "";
    private String board13 = "";

    private String board21 = "";
    private String board22 = "";
    private String board23 = "";

    private String board31 = "";
    private String board32 = "";
    private String board33 = "";

    private String Warning = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get references to the widgets
        button11 = (Button) findViewById(R.id.btn11);
        button12 = (Button) findViewById(R.id.btn12);
        button13 = (Button) findViewById(R.id.btn13);

        button21 = (Button) findViewById(R.id.btn21);
        button22 = (Button) findViewById(R.id.btn22);
        button23 = (Button) findViewById(R.id.btn23);

        button31 = (Button) findViewById(R.id.btn31);
        button32 = (Button) findViewById(R.id.btn32);
        button33 = (Button) findViewById(R.id.btn33);

        textWarning = (TextView) findViewById(R.id.textWarning);

        btnNewGame = (Button) findViewById(R.id.btnNewGame);

        // set the listeners
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        btnNewGame.setOnClickListener(this);

        // Creates and initializes the game board
        game = new TicTacToe();

        // get SharedPreferences object
        savedValues = getSharedPreferences("SavedValues", MODE_PRIVATE);

    }

//    @Override
//    public void onPause() {
//        // save the instance variables
//        Editor editor = savedValues.edit();
//
//        editor.putString("board11", board11);
//        editor.putString("board12", board12);
//        editor.putString("board13", board13);
//
//        editor.putString("board21", board21);
//        editor.putString("board22", board22);
//        editor.putString("board23", board23);
//
//        editor.putString("board31", board31);
//        editor.putString("board32", board32);
//        editor.putString("board33", board33);
//
//        editor.putString("warning", Warning);
//
//        editor.commit();
//
//        super.onPause();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//
//        // get the instance variables
//        board11 = savedValues.getString("board11", "");
//        board12 = savedValues.getString("board12", "");
//        board13 = savedValues.getString("board13", "");
//
//        board21 = savedValues.getString("board21", "");
//        board22 = savedValues.getString("board22", "");
//        board23 = savedValues.getString("board23", "");
//
//        board31 = savedValues.getString("board31", "");
//        board32 = savedValues.getString("board32", "");
//        board33 = savedValues.getString("board33", "");
//
//        Warning = savedValues.getString("warning", "");
//
//        button11.setText(board11);
//        button12.setText(board12);
//        button13.setText(board13);
//
//        button21.setText(board21);
//        button22.setText(board22);
//        button23.setText(board23);
//
//        button31.setText(board31);
//        button32.setText(board32);
//        button33.setText(board33);
//
//        textWarning.setText(Warning);
//
//    }

    private void GameReset() {

        button11.setText("");
        button12.setText("");
        button13.setText("");

        button21.setText("");
        button22.setText("");
        button23.setText("");

        button31.setText("");
        button32.setText("");
        button33.setText("");

        textWarning.setText("New Game");

        game = new TicTacToe();
    }

    @Override
    public void onClick(View v) {
        boolean P1 = false;
        boolean P2 = false;

        if (v.getId() == R.id.btnNewGame) {
            GameReset();
        }
        else {
            if (game.canMove()) {
                switch (v.getId()) {
                    case R.id.btn11:
                        if (!game.move(0, 0)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button11.setText("X");
                            else
                                button11.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                    case R.id.btn12:
                        if (!game.move(0, 1)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button12.setText("X");
                            else
                                button12.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                    case R.id.btn13:
                        if (!game.move(0, 2)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button13.setText("X");
                            else
                                button13.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;

                    case R.id.btn21:
                        if (!game.move(1, 0)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button21.setText("X");
                            else
                                button21.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                    case R.id.btn22:
                        if (!game.move(1, 1)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button22.setText("X");
                            else
                                button22.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                    case R.id.btn23:
                        if (!game.move(1, 2)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button23.setText("X");
                            else
                                button23.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;

                    case R.id.btn31:
                        if (!game.move(2, 0)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button31.setText("X");
                            else
                                button31.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                    case R.id.btn32:
                        if (!game.move(2, 1)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button32.setText("X");
                            else
                                button32.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                    case R.id.btn33:
                        if (!game.move(2, 2)) {
                            textWarning.setText("Invalid Move!");
                        } else {
                            if (game.player1)
                                button33.setText("X");
                            else
                                button33.setText("O");
                            textWarning.setText("Next player!");
                        }
                        break;
                }
            } else {
                textWarning.setText("No more Moves!");
            }
            P1 = game.playerWon(TicTacToe.cell.X);
            P2 = game.playerWon(TicTacToe.cell.O);
            if (P1) {
                textWarning.setText("Player 1 Wins!");
            } else if (P2) {
                textWarning.setText("Player 2 Wins!");
            }
        }
    }

}
