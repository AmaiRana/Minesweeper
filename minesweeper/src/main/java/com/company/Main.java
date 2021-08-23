package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Grid show = new Grid(10,10,10);

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper!");
        System.out.println("Would you like to play?: ");
        System.out.print("Enter 1 for yes, and 2 for no");
        String choice = in.nextLine();
        if (choice == "yes") {
            System.out.println("Grid is 10x10");
            System.out.println();
            show.genGrid();

            show.printGrid();
            show.genMines();
            //show.showMines();
        } else {
            System.out.print("Okay, goodbye");

        }









    }
}
