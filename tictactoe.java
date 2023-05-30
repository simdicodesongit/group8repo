import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static String[] gameBoard;
    static String winner;
    static String player;

    public static String whoIsWinner(){

        for (int i=0; i<8; i++){

            String check = null;

            switch (i){

                case 0: check = gameBoard[0] + gameBoard[1] + gameBoard[2];
                        break;

                case 1: check = gameBoard[3] + gameBoard[4] + gameBoard[5];
                        break;

                case 2: check = gameBoard[6] + gameBoard[7] + gameBoard[8];
                        break;

                case 3: check = gameBoard[0] + gameBoard[3] + gameBoard[6];
                        break;

                case 4: check = gameBoard[1] + gameBoard[4] + gameBoard[7];
                        break;

                case 5: check = gameBoard[2] + gameBoard[5] + gameBoard[8];
                        break;

                case 6: check = gameBoard[0] + gameBoard[4] + gameBoard[8];
                        break;

                case 7: check = gameBoard[2] + gameBoard[4] + gameBoard[6];
                        break;

       
