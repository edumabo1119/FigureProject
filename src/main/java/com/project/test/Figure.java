package com.project.test;
import com.project.test.factories.*;

public abstract class Figure {

    private String color;
    private  String figureType;

    public String getFigureType() {
        return figureType;
    }
    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public abstract double getSpace();
    public abstract void drawFigure();
    public abstract String toString();

}
