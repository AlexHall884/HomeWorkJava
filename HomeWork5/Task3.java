package HomeWork5;
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

import java.util.Scanner;

public class Task3 {
    public static void ViewChessboard(String[][] desk) {

        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk.length; j++) {
                System.out.print(" " + desk[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void PrintChessboard(String[][] desk) {
        System.out.println("Шахматная доска\n");
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk.length; j++) {
                desk[i][j] = "0";
            }
        }
        desk[0][1] = "1";
        desk[0][2] = "2";
        desk[0][3] = "3";
        desk[0][4] = "4";
        desk[0][5] = "5";
        desk[0][6] = "6";
        desk[0][7] = "7";
        desk[0][8] = "8";

        desk[0][0] = " ";

        desk[1][0] = "1";
        desk[2][0] = "2";
        desk[3][0] = "3";
        desk[4][0] = "4";
        desk[5][0] = "5";
        desk[6][0] = "6";
        desk[7][0] = "7";
        desk[8][0] = "8";
    }

    public static void AutoQueenMove(String[][] chessboard, int r) {
        if (r == chessboard.length) {
            System.out.println("Возможное решение: ");
            ViewChessboard(chessboard);
        }

        for (int i = 1; i <= chessboard.length-1; i++) {
            
            if (CheckQueenPosition(chessboard, r, i)) {
          
                chessboard[r][i] = "Q";
                AutoQueenMove(chessboard, r + 1);
                chessboard[r][i] = "0";
            }
        }
    }

    public static Boolean CheckQueenPosition(String[][] desk, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (desk[i][c] == "Q") {
                return false;
            }
        }

        for (int i = 0; i < c; i++) {
            if (desk[r][i] == "Q") {
                return false;
            }
        }

        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (desk[i][j] == "Q") {
                return false;
            }
        }

        for (int i = r, j = c; i >= 0 && j < desk.length; i--, j++) {
            if (desk[i][j] == "Q") {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        String[][] chessboard = new String[9][9];
        PrintChessboard(chessboard);
        AutoQueenMove(chessboard, 1);
        

    }

}
