package com.company;
import java.util.*;
import java.util.Arrays;
//// if this doesnt work, could use Math.random

public class Grid {
    public int mineNum =10;
    public int flagNum;
    public int x;
    public int y;
    public int width = 10;
    public int height =10;
    public int cmineNum;

    char [][] grid;
    int [][] mines;

    public Grid(int width, int height, int mineNum) {
        this.width = width;
        this.height = height;
        this.mineNum = mineNum;

        grid = new char[width][height];
        makeBoard();
    }

    public void makeBoard() {
        genGrid();
        //genMines();

    }

    public void genGrid() {

        for (char i = 0; i < height; i++) {
            for (char j = 0; j < width; j++) {
                grid[i][j] = '#';
            }
        }
    }

    public void printGrid() {
        for (char i = 0; i < height; i++) {
            for (char j = 0; j < width; j++) {
                System.out.print(grid[i][j]);
            } System.out.println();
        }
    }
////////////////////making mines//////

    public void genMines() {
        ////testing random number gen
       // Random rand = new Random();
       // int upper = 10;  //gens number from 0-9
      //  int int_random = rand.nextInt(upper);
       // System.out.println("Random int between 0 to " + (upper - 1) + ":" + int_random);
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
