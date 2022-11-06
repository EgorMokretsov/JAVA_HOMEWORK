package ru.mirea;

import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String args[]){
        double r;
        Circle c1 = new Circle(4.0);
        System.out.println(c1.Perimetr());

        Scanner source = new Scanner(System.in);
        System.out.println("give me r ");
        r = source.nextDouble();
        c1.setR(r);
        System.out.println(c1.Perimetr());

        Circle c = new Circle(4.0);
        Circle[] circles = new Circle[1];
        for (int i = 0; i< circles.length;i++){
            circles[i]=c;
            System.out.println(c);

        }

    }
}
