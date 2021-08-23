package com.company;
import java.util.*;
//// if this doesnt work, could use Math.random

public class Grid {
    public int mineNum =10;
    private int flagNum;
    private int x;
    private int y;
    public int width = 10;
    public int height =10;
    public int cmineNum;

    char [][] gridBoard;
    int [][] mines;

    public Grid(int width, int height, int mineNum) {
        this.width = width;
        this.height = height;
        this.mineNum = mineNum;

        gridBoard = new char[width][height];
        makeBoard();
    }

    public void makeBoard() {
        genGrid();
        //need to use genMines(); to add mine array to game

    }

    public void genGrid() {

        for (char i = 0; i < height; i++) {
            for (char j = 0; j < width; j++) {
                gridBoard[i][j] = '#';
            }
        }
    }

    public void printGrid() {
        for (char i = 0; i < height; i++) {
            for (char j = 0; j < width; j++) {
                System.out.print(gridBoard[i][j]);
            } System.out.println();
        }
    }
////////////////////making mines//////

    public void genMines() {

        mines = new int[width][height];

        cmineNum = 0;
        Random randomx = new Random();
        Random randomy = new Random();
        int upper = 10;


        for (int k = 0; k < 10; k++) {
            mines[randomy.nextInt(upper)][randomx.nextInt(upper)] = -1;
        }

    }

    public void showMines() {
        ///for printing to see if works
        for (int l=0; l<10; l++) {
            for (int m = 0;m<10;m++) {
                System.out.print(mines[l][m]);
            } System.out.println();
        }
    }


}
