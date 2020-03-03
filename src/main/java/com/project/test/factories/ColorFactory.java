package com.project.test.factories;
import java.awt.*;

public class ColorFactory {
    // the object returns a Color object from awt library
    public Color getColor(String color){
        if (color == null){
            return null;
        }
        if (color.toLowerCase().matches("blue")) {
            return Color.BLUE;
        }
        if (color.toLowerCase().matches("red")){
            return Color.RED;
        }
        if (color.toLowerCase().matches("green")){
            return Color.GREEN;
        }
        if (color.toLowerCase().matches("orange")){
            return Color.ORANGE;
        }
        if (color.toLowerCase().matches("yellow")){
            return Color.YELLOW;
        }
        if (color.toLowerCase().matches("violet")){
            return Color.MAGENTA;
        }
        if (color.toLowerCase().matches("grey")){
            return Color.GRAY;
        }
        if (color.toLowerCase().matches("black")){
            return null;
        }
        return null;
    }
}
