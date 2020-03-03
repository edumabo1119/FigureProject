package com.project.test;
import com.project.test.factories.*;
import java.util.ArrayList;
import java.util.Random;

public class MainClass {
    public static void main(String [] args){


        FigureListFactory factory = new FigureListFactory();
        ArrayList <Figure> list1 =  factory.generateList();

        for(Figure figure: list1) {
            System.out.println(figure);
        }















    }
}
