package ru.mirea;

public class Circle {
    private Point x;
    private double r;

    public Circle(double r){
        this.r=r;
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double Perimetr(){
        return(Math.PI*2*r);
    }
}
