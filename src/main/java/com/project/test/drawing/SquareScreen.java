package com.project.test.drawing;
import com.project.test.factories.*;
import com.project.test.Square;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class SquareScreen extends JFrame{
    private int FIELDWIDTH = 600;
    private int FIELDHEIGHT = 600;
    private int STARTHORIZONTALPOINT = FIELDWIDTH / 2;
    private int STARTVERTICALPOINT = FIELDHEIGHT / 2;
    private String color;
    private int line;




    public SquareScreen(Square figure){
        setTitle("Square");
        setSize(FIELDWIDTH, FIELDHEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setColor(figure.getColor());
        setLine(figure.getLine());
    }

    public void paint(Graphics g){
        ColorFactory factory = new ColorFactory();
        Color c = factory.getColor(color);
        g.setColor(c);
        g.fillRect(STARTHORIZONTALPOINT - (line / 2), STARTVERTICALPOINT - (line / 2), line, line);
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
