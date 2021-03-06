package io.hexlet.xo.model;

import io.hexlet.xo.model.exception.AbstractXOException;
import io.hexlet.xo.model.exception.AlreadyOccupiedException;
import io.hexlet.xo.model.exception.AlreadyOccupiedException;
import io.hexlet.xo.model.exception.InvalidPointException;

import java.awt.*;

/**
 * Created by Averkin on 25.04.2016.
 */
public class Field {

    private static final int FIELD_SIZE = 3;
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = FIELD_SIZE-1;

    private final Figure[][] field = new Figure [FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure (final Point point) throws InvalidPointException{
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure (final Point point,final Figure figure) throws InvalidPointException{
        if (!checkPoint(point)) {throw new InvalidPointException();}
        field[point.x][point.y]=figure;
    }

    private boolean checkPoint(final Point point){
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate <= MAX_COORDINATE;
    }
}
