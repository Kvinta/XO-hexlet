package io.hexlet.xo.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Averkin on 26.04.2016!
 */
public class FieldTest {
    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field();
        assertEquals(3,field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {
        Field field = new Field();
        Point inputPoint = new Point(1,1);
        Figure inputFigure = Figure.X;

        field.setFigure(inputPoint,inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure,actualFigure);
    }

}