package io.hexlet.xo.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void testGetPlayers() throws Exception {
        final Player[] inputPlayers = {new Player("Pavel",Figure.X),new Player("Oleg",Figure.O)};
        final Game game = new Game(inputPlayers,null,null);
        final Player[] actualPlayers = game.getPlayers();
        assertArrayEquals(inputPlayers,actualPlayers);
    }

    @Test
    public void testGetField() throws Exception {
        final Field inputField = new Field();
        final Point inputPoint = new Point(1,1);
        final Figure inputFigure = Figure.X;
        inputField.setFigure(inputPoint,inputFigure);
        final Game game = new Game(null,inputField,null);
        final Field actualField = game.getField();
        assertEquals(inputField,actualField);
    }

    @Test
    public void testGetName() throws Exception {
        final String inputGameName = "SuperGame";
        final Game game = new Game(null,null,inputGameName);
        final String actualGameName = game.getName();
        assertEquals(inputGameName,actualGameName);
    }
}