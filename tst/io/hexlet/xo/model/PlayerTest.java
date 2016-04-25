package io.hexlet.xo.model;

import org.junit.Test;
import org.omg.CORBA.StringHolder;

import static org.junit.Assert.*;

/**
 * Created by Averkin on 22.04.2016.
 */
public class PlayerTest {
    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Pavel";
        final String expectedValue = inputValue;
        Player player = new Player(inputValue,null);

        final String actualValue = player.getName();

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        Player player = new Player(null,inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue,actualValue);
    }


}