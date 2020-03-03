package com.project.test;
import com.project.test.drawing.TrapeziumScreen;


public class Trapezium extends Figure{
    private int upperLine;
    private int lowLine;
    private int height;

    public Trapezium(int upperLine, int lowLine, int height, String color){
        if(upperLine <= 0 || lowLine <= 0 || height <= 0){
            throw new IllegalArgumentException("Please, enter a positive number!");
        }
        if(lowLine > 400 || upperLine > 400 || height > 400){
            throw new IllegalArgumentException("The trapezium is too big. Please, try again!");
        }
        if (lowLine == upperLine){
            throw new IllegalArgumentException("You're trying to create a rectangle, not a trapezium!");
        }
        setColor(color);
        setFigureType("Trapezium");
        this.lowLine = lowLine;
        this.upperLine = upperLine;
        this.height = height;
    }

    public int getUpperLine() {
        return upperLine;
    }

    public int getLowLine() {
        return lowLine;
    }

    public int getHeight() {
        return height;
    }

    // call the object for drawing the picture
    @Override
    public void drawFigure() {
        TrapeziumScreen figureScreen = new TrapeziumScreen(this);
    }

    @Override
    public double getSpace() {
        double a = (double) lowLine;
        double b = (double) upperLine;
        double h = (double) height;
        return 0.5 * (a + b) * h;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "color = " + getColor() +
                ", space = " + Math.round(getSpace()) +
                ", upperLine = " + upperLine +
                ", lowLine = " + lowLine +
                ", height = " + height +
                '}';
    }
}
