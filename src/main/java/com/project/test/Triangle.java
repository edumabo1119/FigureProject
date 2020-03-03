package com.project.test;
import com.project.test.drawing.TriangleScreen;


public class Triangle extends Figure{
    private int baseLine;
    private int sideLine;



    public Triangle(int baseLine, int sideLine, String color) {
        if(sideLine <= 0 || baseLine <= 0 ){
            throw new IllegalArgumentException("Please, enter a positive number!");
        }
        if(sideLine > 400 || baseLine > 400 ){
            throw new IllegalArgumentException("Please, enter a value less than 400");
        }
        this.sideLine = sideLine;
        this.baseLine = baseLine;
        setColor(color);
        setFigureType("Triangle");
    }

    public int getSideLine() {
        return sideLine;
    }

    public int getBaseLine() {
        return baseLine;
    }

    public double getHypotenuse(){
        double firstCathetus = (double) sideLine;
        double secondCathetus = (double) baseLine;
        return Math.pow((Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2)), 0.5);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color = " + getColor() +
                ", space = " + Math.round(getSpace())  +
                ", firstCathetus = " + baseLine +
                ", secondCathetus = " + sideLine +
                ", hypotenuse = " + Math.round(getHypotenuse())  +
                '}';
    }

    @Override
    public double getSpace(){
        double a = (double) baseLine;
        double h = (double) sideLine;
        return 0.5 * a * h;
    }

    // call the object for drawing the picture
    @Override
    public void drawFigure(){
        TriangleScreen triangleScreen = new TriangleScreen(this);
    }

}
