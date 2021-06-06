/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex09;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int gallon = 350;
        int length = myApp.getLength();
        int width = myApp.getWidth();
        int area = myApp.getArea(length, width);
        int gallons = myApp.getGallons(area, gallon);
        String outputString = myApp.generateOutputString(gallons, area);
        myApp.printOutput(outputString);
    }

    public int getLength() {
        System.out.print("What is the length? ");
        return in.nextInt();
    }

    public int getWidth() {
        System.out.print("What is the width? ");
        return in.nextInt();
    }

    public int getArea(int length, int width) {
        return length * width;
    }

    public int getGallons(int area, int gallon) {
        if(area == 0) {
            return 0;
        }
        else if(area >0 && area <349) {
            return 1;
        }
        else {
            return (area/gallon)+1;
        }
    }

    public String generateOutputString(int gallons, int area) {
        return "You will need to purchase "+gallons+" gallons of paint to cover "+area+" square feet.";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}