package ru.mirea;
import java.util.Scanner;

public class lab5 {
    public static int fact(int n) {
        int p=1;
        for(int i=1;i<= n; i++){
            p*=i;
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

}
