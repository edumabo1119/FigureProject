package com.project.test.drawing;
import com.project.test.factories.*;
import com.project.test.Triangle;
import javax.swing.*;
import java.awt.*;

public class TriangleScreen extends JFrame {
    private int FIELDWIDTH = 600;
    private int FIELDHEIGHT = 600;
    private int STARTHORIZONTALPOINT = FIELDHEIGHT / 2;
    private int STARTVERTICALPOINT = FIELDHEIGHT / 2;
    private String color;
    private int baseLine;
    private int sideLine;

    public TriangleScreen(Triangle figure){
        setTitle("Triangle");
        setSize(FIELDWIDTH, FIELDHEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        color = figure.getColor();
        baseLine = figure.getBaseLine();
        sideLine = figure.getSideLine();
    }

    public void paint(Graphics g){
        Polygon polygon = new Polygon();
        int startHorizontalPoint = STARTHORIZONTALPOINT - (baseLine / 2);
        int startVerticalPoint = STARTVERTICALPOINT + (sideLine / 2);

        polygon.addPoint(startHorizontalPoint, startVerticalPoint);
        polygon.addPoint(startHorizontalPoint, startVerticalPoint - sideLine);
        polygon.addPoint(startHorizontalPoint + baseLine, startVerticalPoint);


        ColorFactory factory = new ColorFactory();
        Color c = factory.getColor(color);

        g.setColor(c);
        g.fillPolygon(polygon);

    }
}
