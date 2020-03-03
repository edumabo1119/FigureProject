package com.project.test.drawing;
import com.project.test.Circle;
import com.project.test.factories.*;

import javax.swing.JFrame;
import java.awt.*;

public class CircleScreen extends JFrame{
    private int FIELDWIDTH = 600;
    private int FIELDHEIGHT = 600;
    private int STARTHORIZONTALPOINT = FIELDWIDTH / 2;
    private int STARTVERTICALPOINT = FIELDHEIGHT / 2;
    private String color;
    private int line;

    public CircleScreen(Circle figure) {
        setTitle("Circle");
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
        g.fillOval (STARTHORIZONTALPOINT - (line / 2), STARTVERTICALPOINT - (line / 2), line, line);
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
