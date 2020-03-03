package com.project.test;
import com.project.test.drawing.CircleScreen;

public class Circle extends Figure {
    private int line;

    public Circle(int line, String color) {
        if(line <= 0){
            throw new IllegalArgumentException("Please, enter a positive number!");
        }
        if (line > 400){
            throw new IllegalArgumentException("Please, enter a value less than 400");
        }
        this.line = line;
        setFigureType("Circle");
        setColor(color);
    }
    // returns a diameter
    public int getLine() {
        return line;
    }

    public double getRadius(){
        double dLine = (double) line;
        return dLine / 2;
    }
    // call the object for drawing the picture
    @Override
    public void drawFigure(){
        CircleScreen picture = new CircleScreen(this);
    }
    @Override
    public double getSpace() {
        double dLine = (double) line;
        return Math.pow((dLine / 2), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color = " + getColor() +
                ", space = " + Math.round(getSpace() ) +
                ", diameter = " + getLine() +
                ", radius = " + Math.round(getRadius()) +
                '}';
    }
}
