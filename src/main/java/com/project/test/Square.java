package com.project.test;
import com.project.test.factories.*;
import com.project.test.drawing.SquareScreen;

public class Square extends Figure {
    private int line;

    public Square(int line, String color) {
        if(line <= 0){
            throw new IllegalArgumentException("Please, enter a positive number!");
        }
        if (line > 400){
            throw new IllegalArgumentException("Please, enter a value less than 400");
        }
        this.line = line;
        setColor(color);
        setFigureType("Square");
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color = " + getColor() +
                ", space = " + Math.round(getSpace()) +
                ", line = " + line +
                '}';
    }

    // call the object for drawing the picture
    @Override
    public void drawFigure() {
        SquareScreen picture = new SquareScreen(this);
    }
    @Override
    public double getSpace(){
        return Math.pow(line, 2);
    }
}
