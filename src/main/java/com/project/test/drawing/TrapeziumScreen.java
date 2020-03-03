package com.project.test.drawing;
import com.project.test.factories.*;
import com.project.test.Trapezium;
import javax.swing.*;
import java.awt.*;

public class TrapeziumScreen extends JFrame{
    private int FIELDWIDTH = 600;
    private int FIELDHEIGHT = 600;
    private int STARTHORIZONTALPOINT = FIELDWIDTH / 2;
    private int STARTVERTICALPOINT = FIELDHEIGHT / 2;
    private String color;
    private int upperLine;
    private int lowLine;
    private int height;


    public TrapeziumScreen(Trapezium figure){
        setTitle("Trapezium");
        setSize(FIELDWIDTH, FIELDHEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        color = figure.getColor();
        upperLine = figure.getUpperLine();
        lowLine = figure.getLowLine();
        height = figure.getHeight();


    }
    public void paint(Graphics g){
        Polygon polygon = new Polygon();
        int startVerticalPoint = STARTVERTICALPOINT - (height / 2);
        int startHorizontalPoint = STARTHORIZONTALPOINT - (chooseLongerLine() / 2);
        //Point A: x, y
        polygon.addPoint(startHorizontalPoint, startVerticalPoint);
        //Point B: x, y + height
        polygon.addPoint(startHorizontalPoint, startVerticalPoint + height);
        //C: x + lowLine, y + height
        polygon.addPoint(startHorizontalPoint + lowLine, startVerticalPoint + height);
        //D: x + upperLine, y
        polygon.addPoint(startHorizontalPoint + upperLine, startVerticalPoint);

        ColorFactory factory = new ColorFactory();
        Color c = factory.getColor(color);
        g.setColor(c);
        g.fillPolygon(polygon);

    }
    private int chooseLongerLine(){
        if (upperLine > lowLine){
            return upperLine;
        }
        return lowLine;
    }
}
