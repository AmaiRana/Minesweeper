package minesweeper;

import static org.junit.jupiter.api.Assertions.assertions;
import static org.junit.jupiter.api.Assert.assertTrue.
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Grid;

public class Test {

    @Test
    @DisplayName("This is a test to find out if the grid outputs #'s")
    public void testChooseOption() {
        Grid gridTest = new Grid(10,10,10);
        assertTrue(gridTest[5][7] == '#');
    }

}
