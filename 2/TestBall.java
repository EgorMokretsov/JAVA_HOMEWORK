package ru.mirea;

import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(0.0,0.0);
        double x;
        double y;
        Scanner source = new Scanner(System.in);
        System.out.println("give me x and y ");
        x = source.nextDouble();
        y = source.nextDouble();
        b1.setXY(x, y);

        System.out.println(b1.toString());
    }
}
