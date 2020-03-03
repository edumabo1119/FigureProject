package com.project.test.factories;
import com.project.test.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class FigureListFactory {
    /*max number of figures that can be created and put in the returning list,
       the actual number can be less, but not bigger */
    private int maxNum = 20;
    //min size of line that can be generated
    private int minLine = 120;
    //max size of line that can be generated
    private int maxLine = 360;
    Random rand = new Random();

    public ArrayList <Figure> generateList(){
        ArrayList <Figure> list = new ArrayList <Figure>();
        int iter = rand.nextInt(maxNum);
        for(int i =0; i < iter; i++){
            FigureFactory fact = new FigureFactory();
            Figure fig = fact.generateFigure();
            list.add(fig);

        }
        return list;
    }

    private class FigureFactory{
        public Figure generateFigure(){
            Random rand = new Random();
            int coin = rand.nextInt(4);
            ChoseColorFactory f = new ChoseColorFactory();
            String randomColor = f.genarateColor();
            LineSizeGenerator generator = new LineSizeGenerator();

            switch (coin){
                case 0:
                    return new Square(generator.generateNumber(), randomColor);
                case 1:
                    return new Circle(generator.generateNumber(), randomColor);
                case 2:
                    int upLine = generator.generateNumber();
                    int lowLine = generator.generateNumber();
                    while (upLine == lowLine){
                        upLine = generator.generateNumber();
                    }
                    return new Trapezium(upLine, lowLine,
                            generator.generateNumber(), randomColor);
                case 3:
                    return new Triangle(generator.generateNumber(), generator.generateNumber(), randomColor);
            }

            return null;

        }

        private class ChoseColorFactory{
            public String genarateColor(){
                int colorCode = rand.nextInt(8);
                switch (colorCode){
                    case 0:
                        return "blue";
                    case 1:
                        return "red";
                    case 2:
                        return "green";
                    case 3:
                        return "orange";
                    case 4:
                        return "yellow";
                    case 5:
                        return "violet";
                    case 6:
                        return "grey";
                    case 7:
                        return "black";
                }
                return null;
            }
        }

        private class LineSizeGenerator{
            public int generateNumber(){
                int num = maxLine - minLine;
                return (int) (Math.random() * ++num) + minLine;
            }
        }

    }

    public int getMaxNum() {
        return maxNum;
    }


    public int getMinLine() {
        return minLine;
    }


    public int getMaxLine() {
        return maxLine;
    }

}
