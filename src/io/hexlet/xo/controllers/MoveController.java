package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.*;

import java.awt.*;

/**
 * Created by Kvinta on 04.05.2016.
 */
public class MoveController {

    public void applyFigure(final Point point,
                            final Field field,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {
        if (field.getFigure(point)!=null) {throw new AlreadyOccupiedException();}
        field.setFigure(point, figure);
    }
}
